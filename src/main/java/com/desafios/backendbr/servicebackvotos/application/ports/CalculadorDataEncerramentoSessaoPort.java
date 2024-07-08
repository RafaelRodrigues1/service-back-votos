package com.desafios.backendbr.servicebackvotos.application.ports;

import java.time.LocalDateTime;

public interface CalculadorDataEncerramentoSessaoPort {

    LocalDateTime calcular(LocalDateTime abertura, Integer duracao);
}
