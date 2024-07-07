package com.desafios.backendbr.servicebackvotos.infrastructure.handlers;

import com.desafios.backendbr.servicebackvotos.application.usecases.exceptions.AberturaSessaoException;
import com.desafios.backendbr.servicebackvotos.application.usecases.exceptions.CadastroPautaException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.Optional;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({AberturaSessaoException.class, CadastroPautaException.class})
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<ErrorResponse> handleConflictException(RuntimeException exception) {
        return ResponseEntity.of(Optional.of(
                new ErrorResponse(
                        HttpStatus.CONFLICT.value(),
                        exception.getMessage(),
                        LocalDateTime.now()
                )));
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponse> handleGeneralException(Exception exception) {
        return ResponseEntity.of(Optional.of(
                new ErrorResponse(
                        HttpStatus.BAD_REQUEST.value(),
                        exception.getMessage(),
                        LocalDateTime.now()
                )));
    }
}
