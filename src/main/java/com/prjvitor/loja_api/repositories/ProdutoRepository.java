package com.prjvitor.loja_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prjvitor.loja_api.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
