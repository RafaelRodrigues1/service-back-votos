package com.desafios.backendbr.servicebackvotos.application.ports;

import com.desafios.backendbr.servicebackvotos.application.models.Pauta;

import java.util.Set;
import java.util.UUID;

public interface PautaDataPort {

    void cadastrarPauta(Pauta pauta);

    Set<Pauta> listarPautas(Integer qtdePorPagina, Integer pagina);
}
