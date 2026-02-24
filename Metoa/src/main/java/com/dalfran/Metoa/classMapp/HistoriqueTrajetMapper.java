package com.dalfran.Metoa.classMapp;

import com.dalfran.Metoa.dto.historiqueTrajetDTO.HistoriqueTrajetReqDTO;
import com.dalfran.Metoa.dto.historiqueTrajetDTO.HistoriqueTrajetResDTO;
import com.dalfran.Metoa.entity.historiqueTrajet.HistoriqueTrajet;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HistoriqueTrajetMapper {
    HistoriqueTrajetResDTO toResDTO(HistoriqueTrajet historiqueTrajet);

    @Mapping(target = "historiqueTrajetId", ignore = true)
    @Mapping(target = "user", ignore = true)
    HistoriqueTrajet toEntity(HistoriqueTrajetReqDTO historiqueTrajetReqDTO);
    List<HistoriqueTrajetResDTO> toResDTOList(List<HistoriqueTrajet> historiqueTrajetList);
}
