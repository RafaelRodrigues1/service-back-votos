package com.desafios.backendbr.servicebackvotos.infrastructure.repositories;

import com.desafios.backendbr.servicebackvotos.infrastructure.repositories.entities.MotivoInvalidacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MotivoInvalidacaoRepository extends JpaRepository<MotivoInvalidacaoEntity, UUID> {
}
