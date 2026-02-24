package com.dalfran.Metoa.service.conversation;

import com.dalfran.Metoa.entity.fonctionaleterAvances.chatsMessageries.conversation.Conversation;

public interface ConversationService {
    Conversation createConversation(String senderId, String receiverId);
}
