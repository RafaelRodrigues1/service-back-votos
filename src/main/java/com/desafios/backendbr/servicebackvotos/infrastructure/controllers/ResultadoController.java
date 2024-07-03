package com.desafios.backendbr.servicebackvotos.infrastructure.controllers;

import com.desafios.backendbr.servicebackvotos.infrastructure.controllers.dtos.responses.ResultadoResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("resultado")
public class ResultadoController {

    @GetMapping(":idSessao")
    public ResponseEntity<ResultadoResponse> buscarResultado(@PathVariable("idSessao")UUID idSessao) {

        return ResponseEntity.ok(null);
    }
}
