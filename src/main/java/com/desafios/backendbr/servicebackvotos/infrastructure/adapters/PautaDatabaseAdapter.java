package com.desafios.backendbr.servicebackvotos.infrastructure.adapters;

import com.desafios.backendbr.servicebackvotos.application.models.Pauta;
import com.desafios.backendbr.servicebackvotos.application.ports.PautaDataPort;
import com.desafios.backendbr.servicebackvotos.infrastructure.repositories.PautaRepository;
import com.desafios.backendbr.servicebackvotos.infrastructure.repositories.entities.mappers.PautaEntityMapper;
import org.apache.kafka.common.errors.ResourceNotFoundException;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PautaDatabaseAdapter implements PautaDataPort {

    private PautaRepository pautaRepository;
    private Integer QUANTIDADE_POR_PAGINA_PADRAO = 10;
    private Integer PAGINA_PADRAO = 0;

    public PautaDatabaseAdapter(PautaRepository pautaRepository) {
        this.pautaRepository = pautaRepository;
    }

    @Override
    public void cadastrarPauta(Pauta pauta) {
        var pautaEntity = PautaEntityMapper.INSTANCE.toEntity(pauta);
        pautaRepository.save(pautaEntity);
    }

    @Override
    public Set<Pauta> listarPautas(Integer qtdePorPagina, Integer pagina) {
        var qtdePorPaginaBusca = qtdePorPagina != null ? qtdePorPagina: QUANTIDADE_POR_PAGINA_PADRAO;
        var paginaBusca = pagina != null ? pagina: PAGINA_PADRAO;
        var pautaEntitySet = pautaRepository.findAll(Pageable.ofSize(qtdePorPaginaBusca).withPage(paginaBusca)).toSet();
        return pautaEntitySet.stream().map(PautaEntityMapper.INSTANCE::toModel).collect(Collectors.toSet());
    }

    @Override
    public Pauta buscarPorId(UUID id) {
        return PautaEntityMapper.INSTANCE.toModel(pautaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Pauta de id " + id + " não encontrada")));
    }
}
