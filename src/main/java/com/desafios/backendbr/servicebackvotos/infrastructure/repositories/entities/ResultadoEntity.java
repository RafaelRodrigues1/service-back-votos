package com.desafios.backendbr.servicebackvotos.infrastructure.repositories.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "resultado")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResultadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @JoinColumn(name = "idPauta", nullable = false)
    @ManyToOne
    private PautaEntity pauta;
    @Column(name = "aprovada", nullable = false)
    private Boolean aprovada;
    @Column(name = "votoSim", nullable = false)
    private Integer votoSim;
    @Column(name = "votoNao", nullable = false)
    private Integer votoNao;
    @Column(name = "abstencao", nullable = false)
    private Integer abstencao;
    @Column(name = "quorum", nullable = false)
    private Integer quorum;
}
