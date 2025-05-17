package com.prjvitor.loja_api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.prjvitor.loja_api.models.Cliente;
import com.prjvitor.loja_api.services.ClienteService;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public void saveCliente(@RequestBody Cliente cliente) {
        clienteService.saveCliente(cliente);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id) {
        clienteService.deleteCliente(id);
    }

    @GetMapping("/{id}")
    public Cliente getClienteById(@PathVariable Long id) {
        return clienteService.getClienteById(id);
    }

    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteService.getAllClientes();
    }

    @GetMapping("/nome/{nome}")
    public List<Cliente> getClientesByNome(@PathVariable String nome) {
        return clienteService.getClientesByNome(nome);
    }

    @GetMapping("/email/{email}")
    public List<Cliente> getClientesByEmail(@PathVariable String email) {
        return clienteService.getClientesByEmail(email);
    }

    @GetMapping("/telefone/{telefone}")
    public List<Cliente> getClientesByTelefone(@PathVariable String telefone) {
        return clienteService.getClientesByTelefone(telefone);
    }

    @GetMapping("/cpf/{cpf}")
    public List<Cliente> getClientesByCpf(@PathVariable String cpf) {
        return clienteService.getClientesByCpf(cpf);
    }

    @GetMapping("/endereco/{endereco}")
    public List<Cliente> getClientesByEndereco(@PathVariable String endereco) {
        return clienteService.getClientesByEndereco(endereco);
    }

    @GetMapping("/data-nascimento/{dataNascimento}")
    public List<Cliente> getClientesByDataNascimento(@PathVariable String dataNascimento) {
        return clienteService.getClientesByDataNascimento(dataNascimento);
    }

    @PutMapping
    public void updateCliente(@RequestBody Cliente cliente) {
        clienteService.updateCliente(cliente);
    }
}