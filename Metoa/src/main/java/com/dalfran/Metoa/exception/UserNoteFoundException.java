package com.dalfran.Metoa.exception;

public class UserNoteFoundException extends RuntimeException {
    public UserNoteFoundException(String idUser) {

        super("Utilisateur avec l'identifiant " + idUser + " introuvable");
    }
}
