package com.prjvitor.loja_api.models;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class ItemVenda {
    
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private Venda venda;

    @ManyToOne
    private Produto produto;

    private Integer quantidade;
    private BigDecimal precoUnitario;
    private BigDecimal subtotal;
}
