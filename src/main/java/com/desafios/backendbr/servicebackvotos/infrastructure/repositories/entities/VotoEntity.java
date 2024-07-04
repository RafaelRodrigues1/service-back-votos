package com.desafios.backendbr.servicebackvotos.infrastructure.repositories.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "voto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VotoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @JoinColumn(name = "idSessao", nullable = false)
    @ManyToOne
    private SessaoEntity sessao;
    @JoinColumn(name = "idAssociado", nullable = false)
    @ManyToOne
    private AssociadoEntity associado;
    @Column(name = "tipo", nullable = false)
    private String tipo;
}
