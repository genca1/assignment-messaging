package com.assignment.turknet.backend.api.controller;

import com.assignment.turknet.backend.domain.model.User;
import com.assignment.turknet.backend.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{username}")
    public Optional<User> getUser(@PathVariable String username) {
        return userRepository.findByUsername(username);
    }

    @PostMapping("/{username}/block")
    public String blockUser(@PathVariable String username, @RequestBody String blockedUsername) {
        Optional<User> userOpt = userRepository.findByUsername(username);
        if (userOpt.isPresent()) {
            User user = userOpt.get();
            if (!user.getBlockedUsers().contains(blockedUsername)) {
                user.getBlockedUsers().add(blockedUsername);
                userRepository.save(user);
            }
            return "User blocked.";
        }
        return "User not found.";
    }
}
