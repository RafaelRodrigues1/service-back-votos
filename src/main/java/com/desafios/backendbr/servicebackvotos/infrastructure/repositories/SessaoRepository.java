package com.desafios.backendbr.servicebackvotos.infrastructure.repositories;

import com.desafios.backendbr.servicebackvotos.infrastructure.repositories.entities.SessaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface SessaoRepository extends JpaRepository<SessaoEntity, UUID> {

    @Query("""
        select s from SessaoEntity s
        where s.pauta.id = :idPauta
        """)
    SessaoEntity findByPauta(@Param("idPauta") UUID idPauta);
}
