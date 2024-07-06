package com.desafios.backendbr.servicebackvotos.infrastructure.adapters;

import com.desafios.backendbr.servicebackvotos.application.usecases.CalculadorDataEncerramentoSessaoPort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CalculadorDataEncerramentoSessaoMinutosAdapter implements CalculadorDataEncerramentoSessaoPort {

    @Override
    public LocalDateTime calcular(LocalDateTime abertura, Integer duracao) {
        return abertura.plusMinutes(duracao);
    }
}
