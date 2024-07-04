package com.desafios.backendbr.servicebackvotos.infrastructure.repositories;

import com.desafios.backendbr.servicebackvotos.infrastructure.repositories.entities.AssociadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AssociadoRepository extends JpaRepository<AssociadoEntity, UUID> {
}
