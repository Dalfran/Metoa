package com.dalfran.Metoa.classMapp;

import com.dalfran.Metoa.dto.historiqueTrajetDTO.HistoriqueTrajetReqDTO;
import com.dalfran.Metoa.dto.historiqueTrajetDTO.HistoriqueTrajetResDTO;
import com.dalfran.Metoa.entity.historiqueTrajet.HistoriqueTrajet;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper(componentModel = "spring")
public interface historiqueTrajetMapper {
    HistoriqueTrajetResDTO toResDTO(HistoriqueTrajet historique);

    @Mapping(target = "historiqueTrajetId", ignore = true)
    @Mapping(target = "TrajetId", ignore = true)
    @Mapping(target = "dateTrajet", ignore = true)
    @Mapping(target = "user", ignore = true)
    HistoriqueTrajet toEntity(HistoriqueTrajetReqDTO dto);
}
