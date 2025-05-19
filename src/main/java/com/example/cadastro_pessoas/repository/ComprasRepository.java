package com.example.cadastro_pessoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cadastro_pessoas.model.ComprasModel;

import java.util.List;

public interface ComprasRepository extends JpaRepository<ComprasModel, Long> {
    List<ComprasModel> findByPessoaId(Long pessoaId);
}
