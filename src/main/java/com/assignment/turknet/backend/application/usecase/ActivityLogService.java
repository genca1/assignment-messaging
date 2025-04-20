package com.assignment.turknet.backend.application.usecase;

import com.assignment.turknet.backend.domain.model.ActivityLog;
import com.assignment.turknet.backend.domain.repository.ActivityLogRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;

@Service
public class ActivityLogService {
    private final ActivityLogRepository repository;

    public ActivityLogService(ActivityLogRepository repository) {
        this.repository = repository;
    }

    public void log(String username, String action) {
        repository.save(new ActivityLog(username, action, LocalDateTime.now().toEpochSecond(ZoneOffset.UTC)));
    }

    public List<ActivityLog> getLogs(String username) {
        return repository.findByUsername(username);
    }
}
