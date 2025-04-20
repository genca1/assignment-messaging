package com.assignment.turknet.backend.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ActivityLog {
    @Id
    private String id;
    private String username;
    private String action;
    private long timestamp;

    public ActivityLog(String username, String action, long toEpochSecond) {
        this.username = username;
        this.action = action;
        this.timestamp = toEpochSecond;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }

    public long getTimestamp() { return timestamp; }
    public void setTimestamp(long timestamp) { this.timestamp = timestamp; }
}
