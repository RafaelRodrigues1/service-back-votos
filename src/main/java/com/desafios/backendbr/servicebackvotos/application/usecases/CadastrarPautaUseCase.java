package com.desafios.backendbr.servicebackvotos.application.usecases;

import com.desafios.backendbr.servicebackvotos.application.models.Pauta;
import com.desafios.backendbr.servicebackvotos.application.ports.PautaDataPort;
import org.springframework.stereotype.Service;

@Service
public class CadastrarPautaUseCase {

    private final PautaDataPort pautaDataPort;

    public CadastrarPautaUseCase(PautaDataPort pautaDataPort) {
        this.pautaDataPort = pautaDataPort;
    }

    public void executar(Pauta pauta) {
        pautaDataPort.cadastrarPauta(pauta);
    }
}
