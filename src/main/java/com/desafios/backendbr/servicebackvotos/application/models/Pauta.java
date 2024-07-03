package com.desafios.backendbr.servicebackvotos.application.models;

import java.util.UUID;

public record Pauta(UUID id, String descricao, Associado relator) {
}
