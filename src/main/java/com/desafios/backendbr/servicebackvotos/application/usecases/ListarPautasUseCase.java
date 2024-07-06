package com.desafios.backendbr.servicebackvotos.application.usecases;

import com.desafios.backendbr.servicebackvotos.application.models.Pauta;
import com.desafios.backendbr.servicebackvotos.application.ports.PautaDataPort;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ListarPautasUseCase {

    private final PautaDataPort pautaDataPort;

    public ListarPautasUseCase(PautaDataPort pautaDataPort) {
        this.pautaDataPort = pautaDataPort;
    }

    public Set<Pauta> executar(Integer qtdePorPagina, Integer pagina) {
        return pautaDataPort.listarPautas(qtdePorPagina, pagina);
    }
}
