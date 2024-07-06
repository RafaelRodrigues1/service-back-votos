package com.desafios.backendbr.servicebackvotos.application.ports;

import com.desafios.backendbr.servicebackvotos.application.models.Sessao;

public interface ValidadorAberturaSessaoPort {

    void validar(Sessao sessao);
}
