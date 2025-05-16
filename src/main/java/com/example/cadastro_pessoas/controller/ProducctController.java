package com.example.cadastro_pessoas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; // Injeção de dependência
import org.springframework.http.ResponseEntity; // Representa respostas HTTP
import org.springframework.web.bind.annotation.DeleteMapping; // Mapeia requisições DELETE
import org.springframework.web.bind.annotation.GetMapping; // Mapeia requisições GET
import org.springframework.web.bind.annotation.PathVariable; // Captura parâmetros da URL
import org.springframework.web.bind.annotation.PostMapping; // Mapeia requisições POST
import org.springframework.web.bind.annotation.PutMapping; // Mapeia requisições PUT
import org.springframework.web.bind.annotation.RequestBody; // Indica que o corpo da requisição é o objeto
import org.springframework.web.bind.annotation.RequestMapping; // Mapeia o caminho base da API
import org.springframework.web.bind.annotation.RestController;

import com.example.cadastro_pessoas.model.ProductModel;
import com.example.cadastro_pessoas.service.ProductService;






@RestController

@RequestMapping("/api/produtos")

public class ProducctController {

    @Autowired
    private ProductService service;

    @GetMapping
    public List<ProductModel> listarTodos(){
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductModel> buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id)
                                .map(ResponseEntity::ok) 
                                .orElse(ResponseEntity.notFound().build());
    }
    
    @PostMapping
    public ProductModel salvar(@RequestBody ProductModel productModel) {
        return service.salvar(productModel);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<ProductModel> atualizar(@PathVariable Long id, @RequestBody ProductModel productModel){
        if (!service.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }

        productModel.setId(id);
        return ResponseEntity.ok(service.salvar(productModel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        if (!service.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        service.deletar(id);    
        return ResponseEntity.noContent().build();
    }
}
