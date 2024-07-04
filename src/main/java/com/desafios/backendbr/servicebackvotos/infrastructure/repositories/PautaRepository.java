package com.desafios.backendbr.servicebackvotos.infrastructure.repositories;

import com.desafios.backendbr.servicebackvotos.infrastructure.repositories.entities.PautaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PautaRepository extends JpaRepository<PautaEntity, UUID> {
}
