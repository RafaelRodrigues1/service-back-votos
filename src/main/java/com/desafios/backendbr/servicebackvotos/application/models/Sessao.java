package com.desafios.backendbr.servicebackvotos.application.models;

import com.desafios.backendbr.servicebackvotos.application.models.enums.StatusSessao;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

public class Sessao {

    private UUID id;
    private Pauta pauta;
    private Set<Voto> votos;
    private LocalDateTime abertura;
    private LocalDateTime encerramento;
    private StatusSessao status;
    private MotivoInvalidacao motivoInvalidacao;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Pauta getPauta() {
        return pauta;
    }

    public void setPauta(Pauta pauta) {
        this.pauta = pauta;
    }

    public Set<Voto> getVotos() {
        return votos;
    }

    public void setVotos(Set<Voto> votos) {
        this.votos = votos;
    }

    public LocalDateTime getAbertura() {
        return abertura;
    }

    public void setAbertura(LocalDateTime abertura) {
        this.abertura = abertura;
    }

    public LocalDateTime getEncerramento() {
        return encerramento;
    }

    public void setEncerramento(LocalDateTime encerramento) {
        this.encerramento = encerramento;
    }

    public StatusSessao getStatus() {
        return status;
    }

    public void setStatus(StatusSessao status) {
        this.status = status;
    }

    public MotivoInvalidacao getMotivoInvalidacao() {
        return motivoInvalidacao;
    }

    public void setMotivoInvalidacao(MotivoInvalidacao motivoInvalidacao) {
        this.motivoInvalidacao = motivoInvalidacao;
    }
}
