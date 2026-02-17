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
    private String id;
    private String trajetId;
    private String dateTrajet;
    private String roleDansTrajet;
    private String statutTrajet;
}
