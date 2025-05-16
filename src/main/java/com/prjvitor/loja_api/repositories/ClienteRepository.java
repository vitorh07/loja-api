package com.prjvitor.loja_api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prjvitor.loja_api.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
    public List<Cliente> findByNomeContainingIgnoreCase(String nome);
    public List<Cliente> findByEmailContainingIgnoreCase(String email);
    public List<Cliente> findByTelefoneContainingIgnoreCase(String telefone);
    public List<Cliente> findByCpfContainingIgnoreCase(String cpf);
    public List<Cliente> findByEnderecoContainingIgnoreCase(String endereco);
    public List<Cliente> findByDataNascimentoContainingIgnoreCase(String dataNascimento);
}
