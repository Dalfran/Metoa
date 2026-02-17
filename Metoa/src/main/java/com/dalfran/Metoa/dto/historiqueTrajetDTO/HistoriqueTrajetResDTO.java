package com.dalfran.Metoa.dto.historiqueTrajetDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HistoriqueTrajetResDTO {
    private String historiqueTrajetId;
    private String trajetId;
    private String dateTrajet;
    private String rolUseInTrajet;
    private String statutTrajet;
}
