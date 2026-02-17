package com.dalfran.Metoa.entity.historiqueTrajet;

import com.dalfran.Metoa.entity.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "historiqueTrajets")
public class HistoriqueTrajet {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String historiqueTrajetId;
    private String TrajetId ;
    private LocalDate dateTrajet;
    private String rolUseInTrajet;
    private StatusTrajet statusTrajet;
    @ManyToOne
    private User user;

}
