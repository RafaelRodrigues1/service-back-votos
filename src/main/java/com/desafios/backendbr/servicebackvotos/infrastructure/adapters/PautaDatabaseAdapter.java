package com.desafios.backendbr.servicebackvotos.infrastructure.adapters;

import com.desafios.backendbr.servicebackvotos.application.models.Pauta;
import com.desafios.backendbr.servicebackvotos.application.ports.PautaDataPort;
import com.desafios.backendbr.servicebackvotos.infrastructure.repositories.PautaRepository;
import com.desafios.backendbr.servicebackvotos.infrastructure.repositories.entities.mappers.PautaEntityMapper;
import org.springframework.stereotype.Service;

@Service
public class PautaDatabaseAdapter implements PautaDataPort {

    private PautaRepository pautaRepository;

    public PautaDatabaseAdapter(PautaRepository pautaRepository) {
        this.pautaRepository = pautaRepository;
    }

    @Override
    public void cadastrarPauta(Pauta pauta) {
        var pautaEntity = PautaEntityMapper.INSTANCE.toEntity(pauta);
        pautaRepository.save(pautaEntity);
    }
}
