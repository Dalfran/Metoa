package com.dalfran.Metoa.dto.profilDTO;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProfilReqDTO {
    @NotEmpty(message = "entrez votre adress !")
    private String adresse;
    private String sexe;
    private String photoUrl;
    private String dateNaissance;
    @NotEmpty(message = "entrez votre bio !")
    private String bio;
    @NotBlank(message = "Les préférences sont obligatoires")
    private String preferences;
}
