package com.desafios.backendbr.servicebackvotos.infrastructure.controllers;

import com.desafios.backendbr.servicebackvotos.application.usecases.CadastrarPautaUseCase;
import com.desafios.backendbr.servicebackvotos.application.usecases.ListarPautasUseCase;
import com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.mappers.PautaMapper;
import com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.requests.CadastrarPautaRequest;
import com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.responses.PautaResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("pauta")
public class PautaController {

    private final CadastrarPautaUseCase cadastrarPautaUseCase;
    private final ListarPautasUseCase listarPautasUseCase;

    public PautaController(CadastrarPautaUseCase cadastrarPautaUseCase, ListarPautasUseCase listarPautasUseCase) {
        this.cadastrarPautaUseCase = cadastrarPautaUseCase;
        this.listarPautasUseCase = listarPautasUseCase;
    }

    @PostMapping
    public ResponseEntity<Void> cadastrarPauta(@RequestBody CadastrarPautaRequest cadastrarPautaRequest) {
        cadastrarPautaUseCase.executar(PautaMapper.INSTANCE.toModel(cadastrarPautaRequest));
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<Set<PautaResponse>> listarPautas(
            @RequestParam(value = "qtdePorPagina", required = false) Integer qtdePorPagina,
            @RequestParam(value = "pagina", required = false) Integer pagina) {

        return ResponseEntity.ok(listarPautasUseCase.executar(qtdePorPagina, pagina)
                                                        .stream()
                                                        .map(PautaMapper.INSTANCE::toResponse)
                                                        .collect(Collectors.toSet()));
    }
}
