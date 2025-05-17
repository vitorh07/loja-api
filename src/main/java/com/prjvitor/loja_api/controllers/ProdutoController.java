package com.prjvitor.loja_api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.prjvitor.loja_api.models.Produto;
import com.prjvitor.loja_api.services.ProdutoService;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public void saveProduto(@RequestBody Produto produto) {
        produtoService.saveProduto(produto);
    }

    @DeleteMapping("/{id}")
    public void deleteProduto(@PathVariable Long id) {
        produtoService.deleteProduto(id);
    }

    @GetMapping("/{id}")
    public Produto getProdutoById(@PathVariable Long id) {
        return produtoService.getProdutoById(id);
    }

    @GetMapping
    public List<Produto> getAllProdutos() {
        return produtoService.getAllProdutos();
    }

    @GetMapping("/nome/{nome}")
    public List<Produto> getProdutosByNome(@PathVariable String nome) {
        return produtoService.getProdutosByNome(nome);
    }

    @GetMapping("/descricao/{descricao}")
    public List<Produto> getProdutosByDescricao(@PathVariable String descricao) {
        return produtoService.getProdutosByDescricao(descricao);
    }

    @GetMapping("/marca/{marca}")
    public List<Produto> getProdutosByMarca(@PathVariable String marca) {
        return produtoService.getProdutosByMarca(marca);
    }

    @GetMapping("/categoria/{categoria}")
    public List<Produto> getProdutosByCategoria(@PathVariable String categoria) {
        return produtoService.getProdutosByCategoria(categoria);
    }

    @GetMapping("/preco/{preco}")
    public List<Produto> getProdutosByPreco(@PathVariable Double preco) {
        return produtoService.getProdutosByPreco(preco);
    }

    @PutMapping
    public void updateProduto(@RequestBody Produto produto) {
        produtoService.updateProduto(produto);
    }
}