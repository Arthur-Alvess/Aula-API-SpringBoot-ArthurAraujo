package com.example.cadastro_pessoas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cadastro_pessoas.model.ProductModel;
import com.example.cadastro_pessoas.repository.ProductRepository;


@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<ProductModel> listarTodos(){
        return repository.findAll();
    }

    public Optional<ProductModel> buscarPorId(Long id){
        return repository.findById(id);
    }

    public ProductModel salvar(ProductModel productModel){
        return repository.save(productModel);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

}
