package com.desafios.backendbr.servicebackvotos.application.models;

import java.util.UUID;

public class Pauta {

    private UUID id;
    private String descricao;
    private Associado relator;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Associado getRelator() {
        return relator;
    }

    public void setRelator(Associado relator) {
        this.relator = relator;
    }
}
