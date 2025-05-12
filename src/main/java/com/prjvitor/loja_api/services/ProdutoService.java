package com.prjvitor.loja_api.services;

import org.springframework.stereotype.Service;

import com.prjvitor.loja_api.models.Produto;
import com.prjvitor.loja_api.repositories.ProdutoRepository;

@Service
public class ProdutoService {
    
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    // Métodos

    public void saveProduto(Produto produto) {
        produtoRepository.save(produto);
    }
}
