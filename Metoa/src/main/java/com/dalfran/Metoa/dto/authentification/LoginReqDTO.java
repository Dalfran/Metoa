package com.dalfran.Metoa.dto.authentification;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginReqDTO {
    @Email(message = "votre email est erronee !")
    @NotEmpty(message = "entrez votre email !")
    private String email;
    @NotEmpty(message = "entrez votre mote de passe !")
    private String motDePasse;
}
