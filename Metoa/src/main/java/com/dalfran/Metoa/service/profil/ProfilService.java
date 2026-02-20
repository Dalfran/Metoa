package com.dalfran.Metoa.service.profil;

import com.dalfran.Metoa.dto.profilDTO.ProfilReqDTO;
import com.dalfran.Metoa.dto.profilDTO.ProfilResDTO;

public interface ProfilService {
    ProfilResDTO getProfilByUserId(String userId);
    void updateProfilByUserId(String userId, ProfilReqDTO profilReqDTO);
    void deleteProfilByUserId(String userId);
}