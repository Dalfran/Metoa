package com.dalfran.Metoa.entity.profil;

import com.dalfran.Metoa.entity.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Profils")
public class Profil {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String profilId;
    private String adresse;
    private String sexe;
    private String dateNaissance;
    private String bio;
    private Preferences preferences;
    @OneToOne
    private User user;
}
