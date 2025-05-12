package com.prjvitor.loja_api.services;

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
}
