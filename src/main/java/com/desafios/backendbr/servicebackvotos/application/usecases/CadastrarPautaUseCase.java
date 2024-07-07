package com.desafios.backendbr.servicebackvotos.application.usecases;

import com.desafios.backendbr.servicebackvotos.application.models.Pauta;
import com.desafios.backendbr.servicebackvotos.application.ports.PautaDataPort;
import com.desafios.backendbr.servicebackvotos.application.usecases.exceptions.CadastroPautaException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class CadastrarPautaUseCase {

    private final PautaDataPort pautaDataPort;

    public CadastrarPautaUseCase(PautaDataPort pautaDataPort) {
        this.pautaDataPort = pautaDataPort;
    }

    public void executar(Pauta pauta) {
        try {
            pautaDataPort.cadastrarPauta(pauta);
        } catch(DataIntegrityViolationException dataIntegrityViolationException) {
            throw new CadastroPautaException("Já existe pauta cadastrada com a descrição: " + pauta.getDescricao());
        }
    }
}
