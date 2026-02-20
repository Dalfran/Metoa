package com.dalfran.Metoa.dto.role;

import com.dalfran.Metoa.entity.Role;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoleResDTO {
    @Schema(description = "Rôle de l'utilisateur")
    private Role role;

}
