package com.dalfran.Metoa.entity.authentification;

import com.dalfran.Metoa.entity.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Authentification")
public class Authentification {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String authentificationId;
    private String login;
    private String motDePasse;
    private LocalDateTime dernierAcces;
    private CompteurActivite compteurActivite;
    @OneToOne
    private User user;
}
