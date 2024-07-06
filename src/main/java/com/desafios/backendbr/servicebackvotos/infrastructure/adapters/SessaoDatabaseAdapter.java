package com.desafios.backendbr.servicebackvotos.infrastructure.adapters;

import com.desafios.backendbr.servicebackvotos.application.models.Sessao;
import com.desafios.backendbr.servicebackvotos.application.ports.PautaDataPort;
import com.desafios.backendbr.servicebackvotos.application.ports.SessaoDataPort;
import com.desafios.backendbr.servicebackvotos.infrastructure.repositories.SessaoRepository;
import com.desafios.backendbr.servicebackvotos.infrastructure.repositories.entities.mappers.PautaEntityMapper;
import com.desafios.backendbr.servicebackvotos.infrastructure.repositories.entities.mappers.SessaoEntityMapper;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SessaoDatabaseAdapter implements SessaoDataPort {

    private final SessaoRepository sessaoRepository;
    private final PautaDataPort pautaDataPort;

    public SessaoDatabaseAdapter(SessaoRepository sessaoRepository, PautaDataPort pautaDataPort) {
        this.sessaoRepository = sessaoRepository;
        this.pautaDataPort = pautaDataPort;
    }

    @Override
    public Sessao abrirSessao(Sessao sessao) {
        var sessaoEntity = SessaoEntityMapper.INSTANCE.toEntity(sessao);
        var sessaoEntitySalva = sessaoRepository.save(sessaoEntity);
        var pautaEntity = PautaEntityMapper.INSTANCE.toEntity(pautaDataPort.buscarPorId(sessaoEntity.getPauta().getId()));
        sessaoEntitySalva.setPauta(pautaEntity);
        return SessaoEntityMapper.INSTANCE.toModel(sessaoEntitySalva);
    }

    @Override
    public Sessao buscaSessaoPelaPauta(UUID idPauta) {
        return SessaoEntityMapper.INSTANCE.toModel(sessaoRepository.findByPauta(idPauta));
    }
}
