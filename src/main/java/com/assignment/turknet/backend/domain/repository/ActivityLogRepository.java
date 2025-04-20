package com.assignment.turknet.backend.domain.repository;

import com.assignment.turknet.backend.domain.model.ActivityLog;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ActivityLogRepository extends MongoRepository<ActivityLog, String> {
    List<ActivityLog> findByUsername(String username);
}
