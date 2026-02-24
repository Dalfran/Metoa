package com.dalfran.Metoa.dto.authentification;

import com.dalfran.Metoa.dto.userDTO.UserResDTO;
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
public class LoginResDTO {
    private String token;
    private UserResDTO userResDTO;
}
