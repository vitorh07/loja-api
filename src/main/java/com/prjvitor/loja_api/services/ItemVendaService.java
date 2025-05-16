package com.prjvitor.loja_api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prjvitor.loja_api.models.ItemVenda;
import com.prjvitor.loja_api.repositories.ItemVendaRepository;

@Service
public class ItemVendaService {
    
    private final ItemVendaRepository itemVendaRepository;

    public ItemVendaService(ItemVendaRepository itemVendaRepository) {
        this.itemVendaRepository = itemVendaRepository;
    }

    // Métodos

    public void saveItemVenda(ItemVenda itemVenda) {
        itemVendaRepository.save(itemVenda);
    }

    public void deleteItemVenda(Long id) {
        itemVendaRepository.deleteById(id);
    }

    public ItemVenda findItemVendaById(Long id) {
        return itemVendaRepository.findById(id).orElse(null);
    }

    public List<ItemVenda> findAllItemVendas() {
        return itemVendaRepository.findAll();
    }

    public List<ItemVenda> findItemVendasByVendaId(Long vendaId) {
        return itemVendaRepository.findByVendaId(vendaId);
    }

    public List<ItemVenda> findItemVendasByProdutoId(Long produtoId) {
        return itemVendaRepository.findByProdutoId(produtoId);
    }

    public List<ItemVenda> findItemVendasByQuantidade(Integer quantidade) {
        return itemVendaRepository.findByQuantidade(quantidade);
    }

    public void updateItemVenda(ItemVenda itemVenda) {
        itemVendaRepository.save(itemVenda);
    }
}
