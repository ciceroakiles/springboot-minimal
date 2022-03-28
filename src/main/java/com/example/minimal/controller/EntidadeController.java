package com.example.minimal.controller;

import com.example.minimal.dto.MessageResponseDTO;
import com.example.minimal.entity.Entidade;
import com.example.minimal.service.EntidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/entidades")
public class EntidadeController {

    private EntidadeService entidadeService;

    // Injeção de dependência (serviço)
    @Autowired
    public EntidadeController(EntidadeService entidadeService) {
        this.entidadeService = entidadeService;
    }

    // Método POST
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO criaEntidade(@RequestBody Entidade entidade) {
        return entidadeService.criaEntidade(entidade);
    }

    // Mensagem de teste
    @GetMapping
    public String msg() {
        return "API Test";
    }
}
