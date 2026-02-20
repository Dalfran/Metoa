package com.dalfran.Metoa.exception;

import org.springdoc.api.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler extends RuntimeException {

    @ExceptionHandler(UserNoteFoundException.class)
    public ResponseEntity<ErrorMessage> handleUserNotFound(UserNoteFoundException ex) {
        return ResponseEntity.status(404).body(new ErrorMessage(
                ex.getMessage()
        ));
    }

    @ExceptionHandler(UserAlreadyExisteException.class)
    public ResponseEntity<ErrorMessage> handleUserAlreadyExists(UserAlreadyExisteException ex) {
        return  ResponseEntity.status(404).body(new ErrorMessage(ex.getMessage()
        ));
    }

    @ExceptionHandler(InvaidUserDataException.class)
    public ResponseEntity<?> handleInvalidData(InvaidUserDataException ex) {
        return  ResponseEntity.status(404).body(new ErrorMessage(ex.getMessage()
        ));
    }
}
