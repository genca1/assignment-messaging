package com.assignment.turknet.backend.application.usecase;

/*
import com.assignment.turknet.backend.api.dto.AuthRequest;
import com.assignment.turknet.backend.api.dto.AuthResponse;
import com.assignment.turknet.backend.domain.model.User;
import com.assignment.turknet.backend.domain.repository.UserRepository;
import com.assignment.turknet.backend.infrastructure.security.JwtService;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class AuthService {

    private final UserRepository userRepository;
    private final JwtService jwtService;
    private final ActivityLogService activityLogService;

    public AuthService(UserRepository userRepository, JwtService jwtService, ActivityLogService activityLogService) {
        this.userRepository = userRepository;
        this.jwtService = jwtService;
        this.activityLogService = activityLogService;
    }

    public AuthResponse login(AuthRequest request) {
        var userOpt = userRepository.findByUsername(request.getUsername());
        if (userOpt.isEmpty() || !userOpt.get().getPassword().equals(request.getPassword())) {
            activityLogService.log(request.getUsername(), "FAILED_LOGIN");
            throw new RuntimeException("Invalid credentials");
        }

        String token = jwtService.generateToken(request.getUsername());
        activityLogService.log(request.getUsername(), "LOGIN_SUCCESS");

        return new AuthResponse(token);
    }

    public void register(AuthRequest request) {
        Optional<User> existingUser = userRepository.findByUsername(request.getUsername());
        if (existingUser.isPresent()) {
            throw new RuntimeException("User already exists");
        }

        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        userRepository.save(user);

        activityLogService.log(request.getUsername(), "REGISTER_SUCCESS");
    }
}
 */
