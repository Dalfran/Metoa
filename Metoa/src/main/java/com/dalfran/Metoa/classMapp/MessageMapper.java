package com.dalfran.Metoa.classMapp;

import com.dalfran.Metoa.dto.message.MessageReqDTO;
import com.dalfran.Metoa.dto.message.MessageResDTO;
import com.dalfran.Metoa.entity.fonctionaleterAvances.chatsMessageries.message.Message;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MessageMapper {


    @Mapping(source = "sender.idUser", target = "senderId")
    @Mapping(source = "receiver.idUser", target = "receiverId")
    MessageResDTO toResDTO(Message message);

    List<MessageResDTO> toResDTOList(List<Message> messages);}
