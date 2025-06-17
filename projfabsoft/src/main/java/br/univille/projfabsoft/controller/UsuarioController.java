package br.univille.projfabsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.projfabsoft.entity.Usuario;
import br.univille.projfabsoft.service.UsuarioService;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService service;

    // GET todos os usuários
    @GetMapping
    public ResponseEntity<List<Usuario>> getAllUsuarios() {
        var listaUsuarios = service.getAllUsuarios();
        return ResponseEntity.ok(listaUsuarios);
    }

    // POST - salvar um novo usuário
    @PostMapping
    public ResponseEntity<Usuario> save(@RequestBody Usuario usuario) {
        var usuarioSalvo = service.save(usuario);
        return ResponseEntity.ok(usuarioSalvo);  // Retorna o usuário salvo
    }

    // GET por ID
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getById(@PathVariable Long id) {
        var usuario = service.getById(id);
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> update(@PathVariable Long id, @RequestBody Usuario usuarioAtualizado) {
        Usuario usuario = service.update(id, usuarioAtualizado);
        return usuario != null ? ResponseEntity.ok(usuario) : ResponseEntity.notFound().build();
    }


    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> delete(@PathVariable Long id) {
        var usuario = service.delete(id);
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
