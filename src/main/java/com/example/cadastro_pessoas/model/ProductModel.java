package com.example.cadastro_pessoas.model;

import jakarta.persistence.Column;           
import jakarta.persistence.Entity;           
import jakarta.persistence.GeneratedValue;   
import jakarta.persistence.GenerationType;   
import jakarta.persistence.Id;               
import jakarta.persistence.Table;            
import lombok.Getter;                        
import lombok.NoArgsConstructor;             
import lombok.Setter;                        


@Entity


@Table(name = "Produtos") 
@Getter
@Setter
@NoArgsConstructor

public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ProductName", nullable = false)
    private String product_name;

    @Column(name = "Price", nullable = false)
    private double price;

    @Column(name = "QuantidadeEstoque", nullable = false)
    private long quantEstoque;

    @Column(name = "Description", nullable = false)
    private String description;
    
}
