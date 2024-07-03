package com.desafios.backendbr.servicebackvotos.application.models;

import java.util.UUID;

public record MotivoInvalidacao(UUID id, Sessao sessao, String descricao) {
}
