package com.assignment.turknet.backend.repository;

import com.assignment.turknet.backend.model.ActivityLog;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ActivityLogRepository extends MongoRepository<ActivityLog, String> {
    List<ActivityLog> findByUsername(String username);
}
