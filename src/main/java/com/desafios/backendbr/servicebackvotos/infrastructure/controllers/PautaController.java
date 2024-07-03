package com.desafios.backendbr.servicebackvotos.infrastructure.controllers;

import com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.requests.CadastrarPautaRequest;
import com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.responses.PautaResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("pauta")
public class PautaController {

    @PostMapping
    public ResponseEntity<Void> cadastrarPauta(@RequestBody CadastrarPautaRequest cadastrarPautaRequest) {

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<Set<PautaResponse>> listarPautas(@RequestParam("qtdePorPagina") Integer qtdePorPagina, @RequestParam("pagina") Integer pagina) {

        return ResponseEntity.noContent().build();
    }
}
