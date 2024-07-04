package com.desafios.backendbr.servicebackvotos.infrastructure.repositories.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "pauta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PautaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "descricao", nullable = false, unique = true)
    private String descricao;
    @ManyToOne
    @JoinColumn(name = "idAssociado", nullable = false)
    private AssociadoEntity relator;
}
