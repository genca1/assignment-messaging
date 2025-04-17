package com.assignment.turknet.backend.controller;

import com.assignment.turknet.backend.model.ActivityLog;
import com.assignment.turknet.backend.repository.ActivityLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/activity")
public class ActivityLogController {
    @Autowired
    private ActivityLogRepository logRepository;

    @GetMapping("/{username}")
    public List<ActivityLog> getLogs(@PathVariable String username) {
        return logRepository.findByUsername(username);
    }
}
