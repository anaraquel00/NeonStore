package com.rqs.neon_store.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.rqs.neon_store.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}