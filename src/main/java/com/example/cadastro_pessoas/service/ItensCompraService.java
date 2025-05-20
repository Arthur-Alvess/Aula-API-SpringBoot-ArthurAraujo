package com.example.cadastro_pessoas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cadastro_pessoas.model.ItemCompraModel;
import com.example.cadastro_pessoas.repository.ItemCompraRepository;

@Service
public class ItensCompraService {

    @Autowired
    private ItemCompraRepository repository;

    public List<ItemCompraModel> listarTodos(){
        return repository.findAll();
    }

    public Optional<ItemCompraModel> buscarPorId(long id){
        return repository.findById(id);

    }

    public ItemCompraModel criar(ItemCompraModel itensCompraModel){
        return repository.save(itensCompraModel);
    }
    
    public ItemCompraModel atualizar(long id, ItemCompraModel itensCompraModel){
        return repository.save(itensCompraModel);
    }
    

    public void deletar(long id){
        repository.deleteById(id);
    }
}
