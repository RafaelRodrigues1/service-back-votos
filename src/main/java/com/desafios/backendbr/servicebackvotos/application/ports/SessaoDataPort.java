package com.desafios.backendbr.servicebackvotos.application.ports;

import com.desafios.backendbr.servicebackvotos.application.models.Sessao;

public interface SessaoDataPort {

    Sessao abrirSessao(Sessao sessao);
}
