package com.assignment.turknet.backend.service;

import com.assignment.turknet.backend.model.ActivityLog;
import com.assignment.turknet.backend.model.User;
import com.assignment.turknet.backend.repository.ActivityLogRepository;
import com.assignment.turknet.backend.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class AuthService {
    @Autowired private UserRepository userRepository;
    @Autowired private ActivityLogRepository logRepository;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    private static final Logger logger = LoggerFactory.getLogger(AuthService.class);

    public String signup(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        userRepository.save(user);
        log("signup", user.getUsername());
        logger.info("User signed up: {}", user.getUsername());
        return "Signup successful";
    }

    public String login(User user) {
        User dbUser = userRepository.findByUsername(user.getUsername()).orElse(null);
        if (dbUser != null && encoder.matches(user.getPassword(), dbUser.getPassword())) {
            log("login_success", user.getUsername());
            logger.info("User login success: {}", user.getUsername());
            return "Login successful";
        }
        log("login_failed", user.getUsername());
        logger.warn("Login failed for user: {}", user.getUsername());
        return "Invalid credentials";
    }

    private void log(String action, String username) {
        ActivityLog log = new ActivityLog();
        log.setUsername(username);
        log.setAction(action);
        log.setTimestamp(Instant.now().toEpochMilli());
        logRepository.save(log);
    }
}
