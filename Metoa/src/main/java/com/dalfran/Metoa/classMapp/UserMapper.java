package com.dalfran.Metoa.classMapp;

import com.dalfran.Metoa.dto.role.RoleResDTO;
import com.dalfran.Metoa.dto.userDTO.UserReqDTO;
import com.dalfran.Metoa.dto.userDTO.UserResDTO;
import com.dalfran.Metoa.entity.user.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {ProfilMapper.class})
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserResDTO toResDTO(User user);

    @Mapping(target = "passe", source = "passe")
    User toENTITY(UserReqDTO userReqDTO);
}