package com.dalfran.Metoa.classMapp;

import com.dalfran.Metoa.dto.profilDTO.ProfilReqDTO;
import com.dalfran.Metoa.dto.profilDTO.ProfilResDTO;
import com.dalfran.Metoa.entity.profil.Profil;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProfilMapper {

    ProfilMapper INSTANCE = Mappers.getMapper(ProfilMapper.class);

    ProfilResDTO toResDTO(Profil profil);
    @Mapping(target = "profilId", ignore = true)
    Profil toEntity(ProfilReqDTO profilReqDTO);
    @Mapping(target = "profilId", ignore = true)
    void updateProfilFromDTO(ProfilReqDTO dto, @MappingTarget Profil profil);

}
