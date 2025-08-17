package com.petpick.petpick_server.dto;

import lombok.Getter;
import lombok.Setter;


@Getter 
@Setter
public class ChatSendPayload {
    private Long conversationId;
    private Long senderId;
    private String content;
}