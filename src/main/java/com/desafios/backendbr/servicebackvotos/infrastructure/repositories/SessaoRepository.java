package com.desafios.backendbr.servicebackvotos.infrastructure.repositories;

import com.desafios.backendbr.servicebackvotos.infrastructure.repositories.entities.SessaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SessaoRepository extends JpaRepository<SessaoEntity, UUID> {
}
