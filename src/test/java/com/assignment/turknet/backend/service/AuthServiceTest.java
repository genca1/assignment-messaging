package com.assignment.turknet.backend.service;

import com.assignment.turknet.backend.model.User;
import com.assignment.turknet.backend.repository.ActivityLogRepository;
import com.assignment.turknet.backend.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
/*
public class AuthServiceTests {

    @Mock
    private UserRepository userRepository;
    @Mock private ActivityLogRepository logRepository;
    @InjectMocks
    private AuthService authService;

    public AuthServiceTests() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSignupLogsSignupActivity() {
        User user = new User();
        user.setUsername("test");
        user.setPassword("pass");

        when(userRepository.save(any(User.class))).thenReturn(user);
        authService.signup(user);
        verify(logRepository, times(1)).save(any());
    }
}
 */
