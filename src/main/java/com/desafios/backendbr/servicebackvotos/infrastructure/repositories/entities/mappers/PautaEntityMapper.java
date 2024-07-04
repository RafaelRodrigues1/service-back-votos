package com.desafios.backendbr.servicebackvotos.infrastructure.repositories.entities.mappers;

import com.desafios.backendbr.servicebackvotos.application.models.Pauta;
import com.desafios.backendbr.servicebackvotos.infrastructure.repositories.entities.PautaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PautaEntityMapper {

    PautaEntityMapper INSTANCE = Mappers.getMapper(PautaEntityMapper.class);

    Pauta toModel(PautaEntity pautaEntity);

    PautaEntity toEntity(Pauta pauta);
}
