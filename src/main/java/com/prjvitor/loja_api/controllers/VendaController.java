package com.prjvitor.loja_api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prjvitor.loja_api.services.VendaService;

@RestController
@RequestMapping("/api/vendas")
public class VendaController {
    
    private final VendaService vendaService;

    public VendaController(VendaService vendaService) {
        this.vendaService = vendaService;
    }

    // Métodos
}
