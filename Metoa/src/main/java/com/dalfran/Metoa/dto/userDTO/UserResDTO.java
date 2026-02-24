package com.dalfran.Metoa.dto.userDTO;

import com.dalfran.Metoa.dto.profilDTO.ProfilReqDTO;
import com.dalfran.Metoa.entity.Role;
import com.dalfran.Metoa.entity.user.StatusUser;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Slf4j
public class UserResDTO {
    private String idUser;
    private String nom;
    private String prenom;
    private String sexe;
    private String telephone;
    private String email;
    @Schema(description = "Rôle de l'utilisateur")
    private Role role;
    private StatusUser statusUser;
    private ProfilReqDTO profil;
}
