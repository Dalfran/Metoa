package com.dalfran.Metoa.entity.fonctionaleterAvances.chatsMessageries.message;

import com.dalfran.Metoa.entity.fonctionaleterAvances.chatsMessageries.conversation.Conversation;
import com.dalfran.Metoa.entity.user.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
@Entity
@Table(name = "messages")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String messageId;

    @ManyToOne
    @JsonBackReference
    private Conversation conversation;

    @ManyToOne
    private User sender;

    @ManyToOne
    private User receiver;

    private String content;

    @Enumerated(EnumType.STRING)
    private MessageStatus status;

    private LocalDateTime sentAt;
}
