package com.dalfran.Metoa.entity.user;


import com.dalfran.Metoa.entity.Role;
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
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private  String  idUser;
    private String nom;
    private  String prenom;
    private String nee ;
    private String lieux;
    private String sexe;
    private String telephone;
    private String userName;
    private  String passe;
    private String ville;
    private  boolean visibiliterTelephone;
    @Enumerated(EnumType.STRING)
    private  StatusUser statusUser;
    private String dateInscription;
    @OneToOne
    @Enumerated(EnumType.STRING)
    private Role role;
}
