package com.example.minimal.service;

import com.example.minimal.dto.MessageResponseDTO;
import com.example.minimal.entity.Entidade;
import com.example.minimal.repository.EntidadeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntidadeService {

    private EntidadeRepositorio entidadeRepositorio;

    // Injeção de dependência (repositório)
    @Autowired
    public EntidadeService(EntidadeRepositorio entidadeRepositorio) {
        this.entidadeRepositorio = entidadeRepositorio;
    }

    public MessageResponseDTO criaEntidade(Entidade entidade) {
        Entidade entidadeSave = entidadeRepositorio.save(entidade);
        return MessageResponseDTO
            .builder()
            .message("Objeto <Entidade> criado com ID " + entidadeSave.getId())
            .build();
    }
}
