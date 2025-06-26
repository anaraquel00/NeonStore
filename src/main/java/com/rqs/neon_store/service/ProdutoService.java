package com.rqs.neon_store.service;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rqs.neon_store.model.Produto;
import com.rqs.neon_store.repository.ProdutoRepository;
import com.rqs.neon_store.strategy.CalculoFrete;

@Service
public class ProdutoService {
    private final ProdutoRepository repository;
    private final CalculoFrete estrategiaFrete;

    // Injeção de dependências (Repository + Strategy)
    public ProdutoService(
        ProdutoRepository repository,
        @Qualifier("freteComum") CalculoFrete estrategiaFrete
    ) {
        this.repository = repository;
        this.estrategiaFrete = estrategiaFrete;
    }

    public double calcularFrete(Long produtoId) {
        Produto produto = repository.findById(produtoId).orElseThrow();
        return estrategiaFrete.calcular(produto.getPeso());
    }
}