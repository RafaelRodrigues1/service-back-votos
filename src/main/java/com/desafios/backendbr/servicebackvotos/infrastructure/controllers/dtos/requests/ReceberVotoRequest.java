package com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.requests;

import java.util.UUID;

public record ReceberVotoRequest(UUID idAssociado, UUID idSessao, String voto) {
}
