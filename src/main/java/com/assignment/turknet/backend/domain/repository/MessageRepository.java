package com.assignment.turknet.backend.domain.repository;

import com.assignment.turknet.backend.domain.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MessageRepository extends MongoRepository<Message, String> {
    List<Message> findByFromOrTo(String from, String to);
}
