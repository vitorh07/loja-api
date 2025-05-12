package com.prjvitor.loja_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Cliente {
    
    @Id @GeneratedValue
    private Long id;
    private String nome;
    private String email;
    private String telefone;
}
