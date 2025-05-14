package com.prjvitor.loja_api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prjvitor.loja_api.services.ItemVendaService;

@RestController
@RequestMapping("/api/item-vendas")
public class ItemVendaController {
    
    private final ItemVendaService itemVendaService;
    
    public ItemVendaController(ItemVendaService itemVendaService) {
        this.itemVendaService = itemVendaService;
    }

    // Métodos
}
