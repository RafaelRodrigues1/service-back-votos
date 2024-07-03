package com.desafios.backendbr.servicebackvotos.application.models;

import com.desafios.backendbr.servicebackvotos.application.models.enums.TipoAssociado;

import java.util.UUID;

public record Associado(UUID id, String nome, String cpf, TipoAssociado tipo) {
}
