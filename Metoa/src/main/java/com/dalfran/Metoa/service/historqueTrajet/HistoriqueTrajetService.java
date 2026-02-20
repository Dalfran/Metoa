package com.dalfran.Metoa.service.historqueTrajet;

import com.dalfran.Metoa.dto.historiqueTrajetDTO.HistoriqueTrajetResDTO;

import java.util.List;

public interface HistoriqueTrajetService {
HistoriqueTrajetResDTO getFinById(String trajetId);
List<HistoriqueTrajetResDTO> getFinAll();
}
