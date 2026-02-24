package com.dalfran.Metoa.repository;

import com.dalfran.Metoa.entity.fonctionaleterAvances.chatsMessageries.conversation.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ConversationRepo extends JpaRepository<Conversation,String> {

    Optional<Conversation> findByUser1_IdUserAndUser2_IdUser(
            String user1Id, String user2Id
    );
}
