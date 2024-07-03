package com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.responses;

import java.util.UUID;

public record PautaResponse(UUID id, String descricao, AssociadoResponse relator) {
}
