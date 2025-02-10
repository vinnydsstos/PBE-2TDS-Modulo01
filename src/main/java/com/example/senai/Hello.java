package com.example.senai;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class Hello {

    // Instancia o objeto com valores padrão
    private Usuario usuario = new Usuario("Rafael", "11111111111", "1633664422");

    // GET - retorna os dados do usuário
    @GetMapping
    public Usuario getUsuario() {
        return usuario;
    }

    // POST - cria ou substitui o usuário com os dados enviados na requisição
    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario novoUsuario) {
        this.usuario = novoUsuario;
        return this.usuario;
    }

    // PUT - atualiza os dados do usuário
    @PutMapping
    public Usuario atualizarUsuario(@RequestBody Usuario usuarioAtualizado) {
        if (this.usuario != null) {
            this.usuario.setNome(usuarioAtualizado.getNome());
            this.usuario.setCpf(usuarioAtualizado.getCpf());
            this.usuario.setTelefone(usuarioAtualizado.getTelefone());
        }
        return this.usuario;
    }

    // DELETE - "deleta" o usuário (neste exemplo, apenas setamos o objeto como null)
    @DeleteMapping
    public String deletarUsuario() {
        this.usuario = null;
        return "Usuário deletado!";
    }
}
