package com.prjvitor.loja_api.services;

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
}
