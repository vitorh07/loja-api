package com.prjvitor.loja_api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prjvitor.loja_api.models.ItemVenda;

public interface ItemVendaRepository extends JpaRepository<ItemVenda, Long> {
    
    public List<ItemVenda> findByVendaId(Long vendaId);
    public List<ItemVenda> findByProdutoId(Long produtoId);
    public List<ItemVenda> findByQuantidade(Integer quantidade);
}
