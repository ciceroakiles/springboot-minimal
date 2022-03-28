package com.example.minimal.repository;

import com.example.minimal.entity.Entidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntidadeRepositorio extends JpaRepository<Entidade, Long> {
    
}
