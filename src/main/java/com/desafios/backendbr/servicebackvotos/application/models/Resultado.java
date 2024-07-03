package com.desafios.backendbr.servicebackvotos.application.models;

import java.util.UUID;

public record Resultado(UUID id, Pauta pauta, Boolean aprovada, Integer votoSim, Integer votoNao, Integer abstencao, Integer quorum) {
}
