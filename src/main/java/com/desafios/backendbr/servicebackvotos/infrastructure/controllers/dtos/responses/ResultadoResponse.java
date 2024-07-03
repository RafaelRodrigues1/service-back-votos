package com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.responses;

public record ResultadoResponse(String descricaoPauta, Boolean aprovada, Integer votoSim, Integer votoNao, Integer abstencao, Integer quorum) {
}
