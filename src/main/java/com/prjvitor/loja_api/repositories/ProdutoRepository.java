package com.prjvitor.loja_api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prjvitor.loja_api.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
    public List<Produto> findByNomeContainingIgnoreCase(String nome);
    public List<Produto> findByDescricaoContainingIgnoreCase(String descricao);
    public List<Produto> findByMarcaContainingIgnoreCase(String marca);
    public List<Produto> findByCategoriaContainingIgnoreCase(String categoria);
    public List<Produto> findByPreco(Double preco);
}
