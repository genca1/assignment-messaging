package com.assignment.turknet.backend.application.usecase;

import com.assignment.turknet.backend.domain.model.Message;
import com.assignment.turknet.backend.domain.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepo;

    public Message send(String from, Message req) {
        Message msg = new Message(null, from, req.getTo(), req.getContent(), LocalDateTime.now());
        return messageRepo.save(msg);
    }

    public List<Message> getMessages(String username) {
        return messageRepo.findByFromOrTo(username, username);
    }
}
