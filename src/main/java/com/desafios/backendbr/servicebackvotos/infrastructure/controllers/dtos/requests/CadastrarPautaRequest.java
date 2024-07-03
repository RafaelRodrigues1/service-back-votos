package com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.requests;

import java.util.UUID;

public record CadastrarPautaRequest(String descricao, UUID idAssociado) {
}
