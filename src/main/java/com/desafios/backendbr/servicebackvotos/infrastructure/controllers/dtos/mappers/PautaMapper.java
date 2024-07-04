package com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.mappers;

import com.desafios.backendbr.servicebackvotos.application.models.Pauta;
import com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.requests.CadastrarPautaRequest;
import com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.responses.PautaResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PautaMapper {

    PautaMapper INSTANCE = Mappers.getMapper(PautaMapper.class);

    @Mapping(source = "idAssociado", target = "relator.id")
    @Mapping(ignore = true, target = "id")
    Pauta toModel(CadastrarPautaRequest cadastrarPautaRequest);

    PautaResponse toResponse(Pauta pauta);
}
