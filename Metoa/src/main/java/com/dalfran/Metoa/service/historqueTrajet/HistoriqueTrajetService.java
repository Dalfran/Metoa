package com.dalfran.Metoa.service.historqueTrajet;

import com.dalfran.Metoa.dto.historiqueTrajetDTO.HistoriqueTrajetResDTO;
import com.dalfran.Metoa.entity.historiqueTrajet.StatusTrajet;

import java.util.List;

public interface HistoriqueTrajetService {
List<HistoriqueTrajetResDTO > getFindByUserIdAndStatusTrajet(String idUser , StatusTrajet statusTrajet);

}
