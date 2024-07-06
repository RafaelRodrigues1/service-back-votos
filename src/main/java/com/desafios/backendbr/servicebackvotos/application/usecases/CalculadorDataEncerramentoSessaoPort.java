package com.desafios.backendbr.servicebackvotos.application.usecases;

import java.time.LocalDateTime;

public interface CalculadorDataEncerramentoSessaoPort {

    LocalDateTime calcular(LocalDateTime abertura, Integer duracao);
}
