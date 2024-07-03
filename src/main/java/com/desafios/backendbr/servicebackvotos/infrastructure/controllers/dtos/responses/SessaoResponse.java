package com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.responses;

import java.util.UUID;

public record SessaoResponse(UUID idSessao, String descricaoPauta, String encerramento) {
}
