package com.desafios.backendbr.servicebackvotos.infrastructure.repositories.entities.mappers;

import com.desafios.backendbr.servicebackvotos.application.models.Sessao;
import com.desafios.backendbr.servicebackvotos.infrastructure.repositories.entities.SessaoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SessaoEntityMapper {

    SessaoEntityMapper INSTANCE = Mappers.getMapper(SessaoEntityMapper.class);

    Sessao toModel(SessaoEntity sessaoEntity);

    SessaoEntity toEntity(Sessao sessao);
}
