package com.dalfran.Metoa.dto.message;

import com.dalfran.Metoa.entity.fonctionaleterAvances.chatsMessageries.message.MessageStatus;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Data
@Builder
@Slf4j
public class MessageResDTO {
    private String messageId;
    private String content;

    private String senderId;
    private String receiverId;

    private LocalDateTime sentAt;
    private MessageStatus status;


}
