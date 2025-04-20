package com.assignment.turknet.backend.infrastructure.event;

import com.assignment.turknet.backend.domain.model.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MessagePublisher {
    @Autowired
    private ApplicationEventPublisher publisher;

    public void publish(Message message) {
        publisher.publishEvent(new MessageSentEvent(this, message));
    }
}
