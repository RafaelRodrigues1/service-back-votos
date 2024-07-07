package com.desafios.backendbr.servicebackvotos.infrastructure.handlers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class ErrorResponse {

    private Integer codigoStatus;
    private String mensagemErro;
    private LocalDateTime dataHora;

}
