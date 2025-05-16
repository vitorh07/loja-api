package com.prjvitor.loja_api.services;

import java.util.List;

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

    public void deleteProduto(Long id) {
        produtoRepository.deleteById(id);
    }

    public Produto getProdutoById(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    public List<Produto> getAllProdutos() {
        return produtoRepository.findAll();
    }

    public List<Produto> getProdutosByNome(String nome) {
        return produtoRepository.findByNomeContainingIgnoreCase(nome);
    }

    public List<Produto> getProdutosByDescricao(String descricao) {
        return produtoRepository.findByDescricaoContainingIgnoreCase(descricao);
    }

    public List<Produto> getProdutosByMarca(String marca) {
        return produtoRepository.findByMarcaContainingIgnoreCase(marca);
    }

    public List<Produto> getProdutosByCategoria(String categoria) {
        return produtoRepository.findByCategoriaContainingIgnoreCase(categoria);
    }

    public List<Produto> getProdutosByPreco(Double preco) {
        return produtoRepository.findByPreco(preco);
    }

    public void updateProduto(Produto produto) {
        produtoRepository.save(produto);
    }
}
