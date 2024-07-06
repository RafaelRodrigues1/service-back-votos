package com.desafios.backendbr.servicebackvotos.infrastructure.adapters;

import com.desafios.backendbr.servicebackvotos.application.models.Sessao;
import com.desafios.backendbr.servicebackvotos.application.models.enums.StatusSessao;
import com.desafios.backendbr.servicebackvotos.application.ports.ValidadorAberturaSessaoPort;
import com.desafios.backendbr.servicebackvotos.application.usecases.AberturaSessaoException;
import org.springframework.stereotype.Service;

@Service
public class ValidadorAberturaStatusSessaoAdapter implements ValidadorAberturaSessaoPort {

    private static final String MENSAGEM_ERRO_ABERTURA_SESSAO_STATUS_ABERTA = """
            Não foi possivel abrir sessão, pois já existe sessão aberta para votação da mesma pauta
            """;
    private static final String MENSAGEM_ERRO_ABERTURA_SESSAO_STATUS_FECHADA = """
            Não foi possivel abrir sessão, pois a sessão referente a está pauta já foi votada e está encerrada
            """;

    @Override
    public void validar(Sessao sessao) {
        if(sessao == null || sessao.getStatus() == null) return;

        if(sessao.getStatus() == StatusSessao.ABERTA)
            throw new AberturaSessaoException(MENSAGEM_ERRO_ABERTURA_SESSAO_STATUS_ABERTA);
        if(sessao.getStatus() == StatusSessao.FECHADA)
            throw new AberturaSessaoException(MENSAGEM_ERRO_ABERTURA_SESSAO_STATUS_FECHADA);
    }
}
