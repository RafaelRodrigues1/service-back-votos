package com.desafios.backendbr.servicebackvotos.application.usecases;

import com.desafios.backendbr.servicebackvotos.application.models.Sessao;
import com.desafios.backendbr.servicebackvotos.application.models.enums.StatusSessao;
import com.desafios.backendbr.servicebackvotos.application.ports.SessaoDataPort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AbrirSessaoUseCase {

    private final SessaoDataPort sessaoDataPort;
    private final CalculadorDataEncerramentoSessaoPort calculadorDataFinalPort;

    public AbrirSessaoUseCase(SessaoDataPort sessaoDataPort, CalculadorDataEncerramentoSessaoPort calculadorDataFinalPort) {
        this.sessaoDataPort = sessaoDataPort;
        this.calculadorDataFinalPort = calculadorDataFinalPort;
    }

    public Sessao executar(Sessao sessao, Integer duracao) {
        sessao.setAbertura(LocalDateTime.now());
        sessao.setStatus(StatusSessao.ABERTA);
        sessao.setEncerramento(calculadorDataFinalPort.calcular(sessao.getAbertura(), duracao));
        return sessaoDataPort.abrirSessao(sessao);
    }
}
