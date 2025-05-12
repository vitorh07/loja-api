package com.prjvitor.loja_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prjvitor.loja_api.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}
