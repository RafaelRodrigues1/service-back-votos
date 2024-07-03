package com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.responses;

import java.util.UUID;

public record AssociadoResponse(UUID id, String nome, String cpf, String tipo) {
}
