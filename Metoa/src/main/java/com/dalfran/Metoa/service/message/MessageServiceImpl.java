package com.dalfran.Metoa.service.message;

import com.dalfran.Metoa.entity.fonctionaleterAvances.chatsMessageries.conversation.Conversation;
import com.dalfran.Metoa.entity.fonctionaleterAvances.chatsMessageries.message.Message;
import com.dalfran.Metoa.entity.fonctionaleterAvances.chatsMessageries.message.MessageStatus;
import com.dalfran.Metoa.entity.user.User;
import com.dalfran.Metoa.repository.ConversationRepo;
import com.dalfran.Metoa.repository.MessageRepo;
import com.dalfran.Metoa.repository.UserRepo;
import com.dalfran.Metoa.service.conversation.ConversationServiceImpl;
import jakarta.transaction.Transactional;
import lombok.Builder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Builder
public class MessageServiceImpl implements MessageService{

    private final ConversationRepo conversationRepo;
    private final UserRepo userRepo;
    private final MessageRepo messageRepo;
    private final ConversationServiceImpl conversationService;

    public MessageServiceImpl(ConversationRepo conversationRepo, UserRepo userRepo, MessageRepo messageRepo, ConversationServiceImpl conversationService) {
        this.conversationRepo = conversationRepo;

        this.userRepo = userRepo;
        this.messageRepo = messageRepo;
        this.conversationService = conversationService;
    }

    @Override
    public Message sendMessage(String senderId, String receiverId, String content) {
        User sender = userRepo.findById(senderId)
                .orElseThrow(() -> new RuntimeException("Expéditeur introuvable"));

        User receiver = userRepo.findById(receiverId)
                .orElseThrow(() -> new RuntimeException("Recepteur introuvable"));

        Conversation conversation = conversationRepo
                .findByUser1_IdUserAndUser2_IdUser(senderId, receiverId)
                .orElseGet(() -> conversationService.createConversation(senderId, receiverId));

        Message message = Message.builder()
                .sender(sender)
                .receiver(receiver)
                .conversation(conversation)
                .content(content)
                .status(MessageStatus.ENVOYE)
                .sentAt(LocalDateTime.now())
                .build();

        return messageRepo.save(message);
    }

    @Override
    public List<Message> getMessages(String conversationId) {
        return messageRepo.findByConversation_ConversationIdOrderBySentAtAsc(conversationId);
    }

    @Override
    @Transactional
    public void markConversationAsRead(String conversationId, String userId) {

        messageRepo.markMessagesAsRead(conversationId, userId);
    }

    @Override
    public long countUnreadMessages(String conversationId, String userId) {
        return  messageRepo.countByConversation_ConversationIdAndReceiver_IdUserAndStatus(
                conversationId,
                userId,
                MessageStatus.ENVOYE
        );
    }

    @Override
    public Page<Message> getMessagesPaginated(String conversationId, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);

        return messageRepo
                .findByConversation_ConversationIdOrderBySentAtAsc(conversationId, pageable);

    }
}
