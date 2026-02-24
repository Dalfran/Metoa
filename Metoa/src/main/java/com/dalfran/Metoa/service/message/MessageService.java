package com.dalfran.Metoa.service.message;

import com.dalfran.Metoa.entity.fonctionaleterAvances.chatsMessageries.conversation.Conversation;
import com.dalfran.Metoa.entity.fonctionaleterAvances.chatsMessageries.message.Message;
import org.springframework.data.domain.Page;

import java.util.List;

public interface MessageService {
    Message sendMessage(String senderId, String receiverId, String content);
    List<Message> getMessages(String conversationId);
    void markConversationAsRead(String conversationId, String userId);
    long countUnreadMessages(String conversationId, String userId);
    Page<Message> getMessagesPaginated(String conversationId, int page, int size);
}
