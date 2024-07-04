package com.desafios.backendbr.servicebackvotos.infrastructure.controllers;

import com.desafios.backendbr.servicebackvotos.application.usecases.CadastrarPautaUseCase;
import com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.mappers.PautaMapper;
import com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.requests.CadastrarPautaRequest;
import com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.responses.PautaResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("pauta")
public class PautaController {

    private CadastrarPautaUseCase cadastrarPautaUseCase;

    public PautaController(CadastrarPautaUseCase cadastrarPautaUseCase) {
        this.cadastrarPautaUseCase = cadastrarPautaUseCase;
    }

    @PostMapping
    public ResponseEntity<Void> cadastrarPauta(@RequestBody CadastrarPautaRequest cadastrarPautaRequest) {
        cadastrarPautaUseCase.executar(PautaMapper.INSTANCE.toModel(cadastrarPautaRequest));
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<Set<PautaResponse>> listarPautas(@RequestParam("qtdePorPagina") Integer qtdePorPagina, @RequestParam("pagina") Integer pagina) {

        return ResponseEntity.noContent().build();
    }
}
