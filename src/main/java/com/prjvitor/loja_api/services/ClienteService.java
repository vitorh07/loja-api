package com.prjvitor.loja_api.services;

import org.springframework.stereotype.Service;

import com.prjvitor.loja_api.models.Cliente;
import com.prjvitor.loja_api.repositories.ClienteRepository;

@Service
public class ClienteService {
    
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    // Métodos

    public void saveCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }
}
