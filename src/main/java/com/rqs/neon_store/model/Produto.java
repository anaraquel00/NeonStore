package com.rqs.neon_store.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(name = "peso_kg") 
    private double peso; // em kg
    
    
        
        public Produto() {}
    
        
        public Produto(Long id, String nome, double peso) {
            this.id = id;
            this.nome = nome;
            this.peso = peso;
        }
    
    
    
        public Long getId() {
            return id;
        }
    
        public void setId(Long id) {
            this.id = id;
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public double getPeso() {
            return peso;
        
         }
        public void setPeso(double peso) {
        this.peso=peso;
     }

   
}
