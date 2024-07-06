package com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.mappers;

import com.desafios.backendbr.servicebackvotos.application.models.Sessao;
import com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.requests.AbrirSessaoRequest;
import com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.responses.SessaoResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SessaoMapper {

    SessaoMapper INSTANCE = Mappers.getMapper(SessaoMapper.class);

    @Mapping(source = "idPauta", target = "pauta.id")
    Sessao toModel(AbrirSessaoRequest abrirSessaoRequest);

    @Mapping(source = "id", target = "idSessao")
    @Mapping(source = "pauta.descricao", target = "descricaoPauta")
    @Mapping(source = "encerramento", target = "encerramento", dateFormat = "dd/MM/yyyy HH:mm:ss")
    SessaoResponse toResponse(Sessao sessao);
}
