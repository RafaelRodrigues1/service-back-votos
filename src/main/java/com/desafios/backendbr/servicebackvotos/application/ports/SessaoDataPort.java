package com.desafios.backendbr.servicebackvotos.application.ports;

import com.desafios.backendbr.servicebackvotos.application.models.Sessao;

import java.util.UUID;

public interface SessaoDataPort {

    Sessao abrirSessao(Sessao sessao);

    Sessao buscaSessaoPelaPauta(UUID idPauta);
}
