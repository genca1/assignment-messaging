package com.assignment.turknet.backend.api.controller;

import com.assignment.turknet.backend.domain.model.Message;
import com.assignment.turknet.backend.application.usecase.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping
    public ResponseEntity<Message> sendMessage(@RequestBody Message req, Principal principal) {
        Message message = messageService.send(principal.getName(), req);
        return ResponseEntity.ok(message);
    }

    @GetMapping
    public ResponseEntity<List<Message>> getMessages(Principal principal) {
        return ResponseEntity.ok(messageService.getMessages(principal.getName()));
    }
}
