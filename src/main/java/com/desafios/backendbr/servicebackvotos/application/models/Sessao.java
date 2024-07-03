package com.desafios.backendbr.servicebackvotos.application.models;

import com.desafios.backendbr.servicebackvotos.application.models.enums.StatusSessao;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

public record Sessao(UUID id, Pauta pauta, Set<Voto> votos, LocalDateTime abertura, LocalDateTime fechamento, StatusSessao status, MotivoInvalidacao motivoInvalidacao) {
}
