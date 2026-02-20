package com.dalfran.Metoa.exception;

import com.dalfran.Metoa.entity.user.User;

public class InvaidUserDataException extends RuntimeException {
    public InvaidUserDataException(User user) {
        super("Un utilisateur invalide ...");
    }
}
