package com.prjvitor.loja_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prjvitor.loja_api.models.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long>{
    
}
