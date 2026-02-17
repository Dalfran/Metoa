package com.dalfran.Metoa.dto.profilDTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProfilResDTO {
    private String profiId;
    private String adresse;
    private String sexe;
    private String dateNaissance;
    private String bio;
}
