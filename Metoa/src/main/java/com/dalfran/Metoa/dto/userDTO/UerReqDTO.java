package com.dalfran.Metoa.dto.userDTO;


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
public class UerReqDTO {
    @NotEmpty(message = "entrez votre nom !")
    private String nom;
    @NotEmpty(message = "entrez votre prenom !")
    private String prenom;
    @NotEmpty(message = "entrez votre tel ")
    private String telephone;
    @Email(message = "votre email est erronee !")
    @NotEmpty(message = "entrez votre email !")
    private String email;
    @NotEmpty(message = "entrez votre mote de passe ! ")
    private String motDePasse;
}
