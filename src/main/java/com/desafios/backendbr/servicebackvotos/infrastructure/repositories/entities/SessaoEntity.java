package com.desafios.backendbr.servicebackvotos.infrastructure.repositories.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "sessao")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SessaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @JoinColumn(name = "idPauta", nullable = false)
    @ManyToOne
    private PautaEntity pauta;
    @OneToMany(mappedBy = "sessao")
    private Set<VotoEntity> votos;
    @Column(name = "abertura", nullable = false)
    private LocalDateTime abertura;
    @Column(name = "encerramento", nullable = false)
    private LocalDateTime encerramento;
    @Column(name = "status", nullable = false)
    private String status;
    @JoinColumn(name = "idMotivoInvalidacao")
    @OneToOne
    private MotivoInvalidacaoEntity motivoInvalidacao;
}
