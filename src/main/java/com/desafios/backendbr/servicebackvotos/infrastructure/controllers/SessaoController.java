package com.desafios.backendbr.servicebackvotos.infrastructure.controllers;

import com.desafios.backendbr.servicebackvotos.application.usecases.AbrirSessaoUseCase;
import com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.mappers.SessaoMapper;
import com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.requests.AbrirSessaoRequest;
import com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.requests.ReceberVotoRequest;
import com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.responses.SessaoResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sessao")
public class SessaoController {

    private final AbrirSessaoUseCase abrirSessaoUseCase;

    public SessaoController(AbrirSessaoUseCase abrirSessaoUseCase) {
        this.abrirSessaoUseCase = abrirSessaoUseCase;
    }

    @PostMapping
    public ResponseEntity<SessaoResponse> abrirSessao(@RequestBody AbrirSessaoRequest abrirSessaoRequest) {
        var sessaoAberta = abrirSessaoUseCase.executar(SessaoMapper.INSTANCE.toModel(abrirSessaoRequest), abrirSessaoRequest.duracao());
        return ResponseEntity.ok(SessaoMapper.INSTANCE.toResponse(sessaoAberta));
    }

    @PostMapping("votar")
    public ResponseEntity<Void> receberVotos(@RequestBody ReceberVotoRequest receberVotoRequest) {

        return ResponseEntity.noContent().build();
    }
}
