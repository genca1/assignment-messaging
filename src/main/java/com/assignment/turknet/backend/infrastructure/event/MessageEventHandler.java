package com.assignment.turknet.backend.infrastructure.event;

import com.assignment.turknet.backend.domain.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MessageEventHandler {

    @Autowired
    private MessageRepository repository;

    @EventListener
    public void handle(MessageSentEvent event) {
        repository.save(event.getMessage());
    }
}
