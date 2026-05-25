package com.estudo.apispringprodutos.controller;

import com.estudo.apispringprodutos.model.Produto;
import com.estudo.apispringprodutos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    // 1. BUSCAR TODOS (GET)
    @GetMapping("/api/produtos")
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    // 2. CADASTRAR PRODUTO (POST)
    // CADASTRAR UMA LISTA DE PRODUTOS (POST)
    @PostMapping("/api/produtos")
    public List<Produto> salvarProdutos(@RequestBody List<Produto> produtos) {
        // Agora o @RequestBody aceita uma List<> (colchetes [ ] no JSON)
        // O método .saveAll() do JPA salva todos os itens de uma vez no MySQL
        return produtoRepository.saveAll(produtos);
    }

    // 3. ATUALIZAR PRODUTO (PUT)
    @PutMapping("/api/produtos/{id}")
    public Produto atualizarProduto(@PathVariable Long id, @RequestBody Produto produtoAlterado) {
        // @PathVariable captura o ID que passamos na URL (ex: /api/produtos/1)
        Optional<Produto> produtoExistente = produtoRepository.findById(id);

        if (produtoExistente.isPresent()) {
            Produto produto = produtoExistente.get();
            produto.setNome(produtoAlterado.getNome());
            produto.setPreco(produtoAlterado.getPreco());
            return produtoRepository.save(produto); // O .save() atualiza se o ID já existir
        }

        return null; // Caso não ache o produto, retorna vazio por enquanto
    }

    // 4. DELETAR PRODUTO (DELETE)
    @DeleteMapping("/api/produtos/{id}")
    public String deletarProduto(@PathVariable Long id) {
        if (produtoRepository.existsById(id)) {
            produtoRepository.deleteById(id);
            return "Produto deletado com sucesso! ❌";
        }
        return "Produto não encontrado.";
    }
}