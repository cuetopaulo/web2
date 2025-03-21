package com.example.primeiro_projeto.controller;

import com.example.primeiro_projeto.model.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>();

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        usuario.setId((long) (usuarios.size() + 1));
        usuarios.add(usuario);
        return usuario;
    }

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

    @GetMapping("/{id}")
    public Usuario obterUsuario(@PathVariable Long id) {
        return usuarios.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PutMapping("/{id}")
    public Usuario atualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuarioAtualizado) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                usuario.setNome(usuarioAtualizado.getNome());
                usuario.setEmail(usuarioAtualizado.getEmail());
                return usuario;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deletarUsuario(@PathVariable Long id) {
        usuarios.removeIf(u -> u.getId().equals(id));
        return "Usuário removido com sucesso!";
    }
}
