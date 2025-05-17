package com.prjvitor.loja_api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.prjvitor.loja_api.models.ItemVenda;
import com.prjvitor.loja_api.services.ItemVendaService;

@RestController
@RequestMapping("/api/item-vendas")
public class ItemVendaController {
    
    private final ItemVendaService itemVendaService;
    
    public ItemVendaController(ItemVendaService itemVendaService) {
        this.itemVendaService = itemVendaService;
    }

    @PostMapping
    public void saveItemVenda(@RequestBody ItemVenda itemVenda) {
        itemVendaService.saveItemVenda(itemVenda);
    }

    @DeleteMapping("/{id}")
    public void deleteItemVenda(@PathVariable Long id) {
        itemVendaService.deleteItemVenda(id);
    }

    @GetMapping("/{id}")
    public ItemVenda findItemVendaById(@PathVariable Long id) {
        return itemVendaService.findItemVendaById(id);
    }

    @GetMapping
    public List<ItemVenda> findAllItemVendas() {
        return itemVendaService.findAllItemVendas();
    }

    @GetMapping("/venda/{vendaId}")
    public List<ItemVenda> findItemVendasByVendaId(@PathVariable Long vendaId) {
        return itemVendaService.findItemVendasByVendaId(vendaId);
    }

    @GetMapping("/produto/{produtoId}")
    public List<ItemVenda> findItemVendasByProdutoId(@PathVariable Long produtoId) {
        return itemVendaService.findItemVendasByProdutoId(produtoId);
    }

    @GetMapping("/quantidade/{quantidade}")
    public List<ItemVenda> findItemVendasByQuantidade(@PathVariable Integer quantidade) {
        return itemVendaService.findItemVendasByQuantidade(quantidade);
    }

    @PutMapping
    public void updateItemVenda(@RequestBody ItemVenda itemVenda) {
        itemVendaService.updateItemVenda(itemVenda);
    }
}