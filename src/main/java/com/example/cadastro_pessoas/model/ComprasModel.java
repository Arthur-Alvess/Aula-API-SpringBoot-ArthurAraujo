package com.example.cadastro_pessoas.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;           
import jakarta.persistence.Entity;           
import jakarta.persistence.GeneratedValue;   
import jakarta.persistence.GenerationType;   
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;            
import lombok.Getter;                        
import lombok.NoArgsConstructor;             
import lombok.Setter;                        


@Entity


@Table(name = "Compras") 
@Getter
@Setter
@NoArgsConstructor

public class ComprasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataCompra;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private PessoasModel pessoa;
}
