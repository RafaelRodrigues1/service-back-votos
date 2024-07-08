package com.desafios.backendbr.servicebackvotos.application.usecases;

import com.desafios.backendbr.servicebackvotos.application.models.Sessao;
import com.desafios.backendbr.servicebackvotos.application.models.enums.StatusSessao;
import com.desafios.backendbr.servicebackvotos.application.ports.CalculadorDataEncerramentoSessaoPort;
import com.desafios.backendbr.servicebackvotos.application.ports.SessaoDataPort;
import com.desafios.backendbr.servicebackvotos.application.ports.ValidadorAberturaSessaoPort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AbrirSessaoUseCase {

    private final SessaoDataPort sessaoDataPort;
    private final CalculadorDataEncerramentoSessaoPort calculadorDataFinalPort;
    private final List<ValidadorAberturaSessaoPort> validadorAberturaSessaoPortList;

    public AbrirSessaoUseCase(SessaoDataPort sessaoDataPort,
                              CalculadorDataEncerramentoSessaoPort calculadorDataFinalPort,
                              List<ValidadorAberturaSessaoPort> validadorAberturaSessaoPortList) {
        this.sessaoDataPort = sessaoDataPort;
        this.calculadorDataFinalPort = calculadorDataFinalPort;
        this.validadorAberturaSessaoPortList = validadorAberturaSessaoPortList;
    }

    public Sessao executar(Sessao sessao, Integer duracao) {
        var sessaoExistente = sessaoDataPort.buscaSessaoPelaPauta(sessao.getPauta().getId());

        validadorAberturaSessaoPortList.forEach(validadorAberturaSessaoPort ->
                validadorAberturaSessaoPort.validar(sessaoExistente != null ? sessaoExistente : sessao)
        );

        sessao.setAbertura(LocalDateTime.now());
        sessao.setStatus(StatusSessao.ABERTA);
        sessao.setEncerramento(calculadorDataFinalPort.calcular(sessao.getAbertura(), duracao));
        return sessaoDataPort.abrirSessao(sessao);
    }
}
