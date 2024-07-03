package com.desafios.backendbr.servicebackvotos.infrastructure.controllers;

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

    @PostMapping
    public ResponseEntity<SessaoResponse> abrirSessao(@RequestBody AbrirSessaoRequest abrirSessaoRequest) {

        return ResponseEntity.ok(null);
    }

    @PostMapping("votar")
    public ResponseEntity<Void> receberVotos(@RequestBody ReceberVotoRequest receberVotoRequest) {

        return ResponseEntity.noContent().build();
    }
}
