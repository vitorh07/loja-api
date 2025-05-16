package com.prjvitor.loja_api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prjvitor.loja_api.models.Venda;
import com.prjvitor.loja_api.repositories.VendaRepository;

@Service
public class VendaService {
    
    private final VendaRepository vendaRepository;
    
    public VendaService(VendaRepository vendaRepository) {
        this.vendaRepository = vendaRepository;
    }

    // Métodos
    public void realizarVenda(Venda venda) {
        vendaRepository.save(venda);
    }

    public void cancelarVenda(Long id) {
        vendaRepository.deleteById(id);
    }

    public Venda buscarVendaPorId(Long id) {
        return vendaRepository.findById(id).orElse(null);
    }

    public List<Venda> listarTodasVendas() {
        return vendaRepository.findAll();
    }

    public List<Venda> buscarVendasPorClienteId(Long clienteId) {
        return vendaRepository.findByClienteId(clienteId);
    }

    public List<Venda> buscarVendasPorData(String data) {
        return vendaRepository.findByData(data);
    }

    public List<Venda> buscarVendasPorValor(Double valor) {
        return vendaRepository.findByValor(valor);
    }

    public void atualizarVenda(Venda venda) {
        vendaRepository.save(venda);
    }
}
