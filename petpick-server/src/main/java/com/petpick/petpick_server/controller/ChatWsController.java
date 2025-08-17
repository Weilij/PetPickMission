package com.petpick.petpick_server.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import com.petpick.petpick_server.dto.ChatSendPayload;
import com.petpick.petpick_server.dto.MessageDTO;
import com.petpick.petpick_server.service.ChatService;

@Controller
public class ChatWsController {

    private final ChatService chatService;
    private final SimpMessagingTemplate broker;

    public ChatWsController(ChatService chatService, SimpMessagingTemplate broker) {
        this.chatService = chatService;
        this.broker = broker;
    }

    // 前端 stomp.send("/app/chat.send", {}, JSON.stringify({...}))
    @MessageMapping("/chat.send")
    public void send(@Payload ChatSendPayload payload) {
        // 寫入 DB
        MessageDTO saved = chatService.send(payload.getConversationId(),
                                            payload.getSenderId(),
                                            payload.getContent());
        // 廣播到該對話的 topic
        String topic = "/topic/conversations." + saved.getConversationId();
        broker.convertAndSend(topic, saved);
    }
}
