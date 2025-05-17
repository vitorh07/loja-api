package com.prjvitor.loja_api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.prjvitor.loja_api.models.Venda;
import com.prjvitor.loja_api.services.VendaService;

@RestController
@RequestMapping("/api/vendas")
public class VendaController {
    
    private final VendaService vendaService;

    public VendaController(VendaService vendaService) {
        this.vendaService = vendaService;
    }

    @PostMapping
    public void realizarVenda(@RequestBody Venda venda) {
        vendaService.realizarVenda(venda);
    }

    @DeleteMapping("/{id}")
    public void cancelarVenda(@PathVariable Long id) {
        vendaService.cancelarVenda(id);
    }

    @GetMapping("/{id}")
    public Venda buscarVendaPorId(@PathVariable Long id) {
        return vendaService.buscarVendaPorId(id);
    }

    @GetMapping
    public List<Venda> listarTodasVendas() {
        return vendaService.listarTodasVendas();
    }

    @GetMapping("/cliente/{clienteId}")
    public List<Venda> buscarVendasPorClienteId(@PathVariable Long clienteId) {
        return vendaService.buscarVendasPorClienteId(clienteId);
    }

    @GetMapping("/data/{data}")
    public List<Venda> buscarVendasPorData(@PathVariable String data) {
        return vendaService.buscarVendasPorData(data);
    }

    @GetMapping("/valor/{valor}")
    public List<Venda> buscarVendasPorValor(@PathVariable Double valor) {
        return vendaService.buscarVendasPorValor(valor);
    }

    @PutMapping
    public void atualizarVenda(@RequestBody Venda venda) {
        vendaService.atualizarVenda(venda);
    }
}