package com.prjvitor.loja_api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prjvitor.loja_api.models.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long>{

    public List<Venda> findByClienteId(Long clienteId);
    public List<Venda> findByData(String data);
    public List<Venda> findByValor(Double valor);
}
