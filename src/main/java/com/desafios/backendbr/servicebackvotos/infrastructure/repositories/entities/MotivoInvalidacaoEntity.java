package com.desafios.backendbr.servicebackvotos.infrastructure.repositories.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "motivo_invalidacao")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MotivoInvalidacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @OneToOne(mappedBy = "motivoInvalidacao")
    private SessaoEntity sessao;
    @Column(name = "descricao", nullable = false)
    private String descricao;
}
