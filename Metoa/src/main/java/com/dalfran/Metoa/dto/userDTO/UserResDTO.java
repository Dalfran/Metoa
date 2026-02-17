package com.dalfran.Metoa.dto.userDTO;

import com.dalfran.Metoa.entity.Role;
import com.dalfran.Metoa.entity.user.StatusUser;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResDTO {
    private String idUser;
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    private Role role;
    private StatusUser statusUser;
}
