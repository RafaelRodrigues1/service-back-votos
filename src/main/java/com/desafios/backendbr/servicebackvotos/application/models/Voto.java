package com.desafios.backendbr.servicebackvotos.application.models;

import com.desafios.backendbr.servicebackvotos.application.models.enums.TipoVoto;

import java.util.UUID;

public record Voto(UUID id, Sessao sessao, Associado associado, TipoVoto tipo) {
}
