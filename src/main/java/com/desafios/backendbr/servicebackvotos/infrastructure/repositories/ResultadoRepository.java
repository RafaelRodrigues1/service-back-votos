package com.desafios.backendbr.servicebackvotos.infrastructure.repositories;

import com.desafios.backendbr.servicebackvotos.infrastructure.repositories.entities.ResultadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ResultadoRepository extends JpaRepository<ResultadoEntity, UUID> {
}
