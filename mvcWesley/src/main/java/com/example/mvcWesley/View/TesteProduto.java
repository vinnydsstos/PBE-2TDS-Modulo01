package com.example.mvcWesley.View;

import com.example.mvcWesley.Model.Produto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
public class TesteProduto {

    public Produto produto = new Produto(1, "Coca", "refri", 1.00, 4, "Bar do Zé");

    @GetMapping
    public Produto getProduto() {
        return produto;
    }

    @PostMapping
    public Produto addProduto(@RequestBody Produto novoProduto ) {
        this.produto = novoProduto;
        return this.produto;
    }

    @PutMapping
    public Produto atualizarProduto(@RequestBody Produto produtoAtualizado) {
        if (this.produto != null) {
            this.produto.setIdProduto(produtoAtualizado.getIdProduto());
            this.produto.setNomeProduto(produtoAtualizado.getNomeProduto());
            this.produto.setDescricao(produtoAtualizado.getDescricao());
            this.produto.setPreco(produtoAtualizado.getPreco());
            this.produto.setQuantidade(produtoAtualizado.getQuantidade());
            this.produto.setPontoDeVenda(produtoAtualizado.getPontoDeVenda());
        }
        return this.produto;
    }

    @DeleteMapping
    public String deletarProduto() {
        this.produto = null;
        return "Produto deletado";
    }
}
