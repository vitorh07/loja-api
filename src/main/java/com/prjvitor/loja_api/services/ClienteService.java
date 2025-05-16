package com.prjvitor.loja_api.services;

import java.util.List;

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

    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    public Cliente getClienteById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    public List<Cliente> getClientesByNome(String nome) {
        return clienteRepository.findByNomeContainingIgnoreCase(nome);
    }

    public List<Cliente> getClientesByEmail(String email) {
        return clienteRepository.findByEmailContainingIgnoreCase(email);
    }

    public List<Cliente> getClientesByTelefone(String telefone) {
        return clienteRepository.findByTelefoneContainingIgnoreCase(telefone);
    }

    public List<Cliente> getClientesByCpf(String cpf) {
        return clienteRepository.findByCpfContainingIgnoreCase(cpf);
    }

    public List<Cliente> getClientesByEndereco(String endereco) {
        return clienteRepository.findByEnderecoContainingIgnoreCase(endereco);
    }

    public List<Cliente> getClientesByDataNascimento(String dataNascimento) {
        return clienteRepository.findByDataNascimentoContainingIgnoreCase(dataNascimento);
    }

    public void updateCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }
}
