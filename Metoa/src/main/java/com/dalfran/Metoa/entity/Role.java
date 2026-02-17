package com.dalfran.Metoa.entity;

import com.dalfran.Metoa.entity.user.User;
import jakarta.persistence.*;

@Entity
@Table(name = "Roles")
public enum Role {
    PASSAGER("passager"),
    CHAUFFEUR("CONDUCTEUR"),
    ADMIN("adminsistrateur");


    private final String label;

    Role(String label){
        this.label= label;
    }
    @ManyToOne
    private User user;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String roleId;
}
