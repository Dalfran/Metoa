package com.dalfran.Metoa.dto.historiqueTrajetDTO;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HistoriqueTrajetReqDTO {
    private String historiqueTrajetId;
    private String trajetId;
    @NotEmpty(message = "entrez votre role !")
    private String rolUseInTrajet;
}
