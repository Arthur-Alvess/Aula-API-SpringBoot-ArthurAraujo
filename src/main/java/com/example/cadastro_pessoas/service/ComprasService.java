package com.example.cadastro_pessoas.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cadastro_pessoas.model.ComprasModel;
import com.example.cadastro_pessoas.repository.ComprasRepository;

@Service
public class ComprasService {

    @Autowired
    private ComprasRepository repository;

    public List<ComprasModel> listarTodos(){
        return repository.findAll();
    }

    public Optional<ComprasModel> buscarPorId(long id){
        return repository.findById(id);

    }

    public ComprasModel criar(ComprasModel comprasModel){
        comprasModel.setDataCompra(LocalDateTime.now());
        return repository.save(comprasModel);
    }
    
    public ComprasModel atualizar(long id, ComprasModel comprasModel){
        return repository.save(comprasModel);
    }
    

    public void deletar(long id){
        repository.deleteById(id);
    }
}