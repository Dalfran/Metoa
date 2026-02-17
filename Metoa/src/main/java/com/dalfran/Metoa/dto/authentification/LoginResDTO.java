package com.dalfran.Metoa.dto.authentification;

import com.dalfran.Metoa.dto.userDTO.UserResDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginResDTO {
    private String token;
    private UserResDTO userResDTO;
}
