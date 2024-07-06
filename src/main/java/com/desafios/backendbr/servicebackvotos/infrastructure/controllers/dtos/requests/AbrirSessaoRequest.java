package com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.requests;

import java.util.UUID;

public record AbrirSessaoRequest(UUID idPauta, Integer duracao) {

    public AbrirSessaoRequest(UUID idPauta) {
        this(idPauta, 1);
    }
}
