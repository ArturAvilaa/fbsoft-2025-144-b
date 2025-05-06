package br.univille.projfabsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.univille.projfabsoft.entity.Usuario;
import br.univille.projfabsoft.service.UsuarioService;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService service;

    @GetMapping
    public ResponseEntity<List<Usuario>> getAllUsuarios() {
        var listaUsuarios = service.getAllUsuarios();
        return ResponseEntity.ok(listaUsuarios);
    }

    @PostMapping
    public ResponseEntity<Usuario> save(@RequestBody Usuario usuario) {
        var usuarioSalvo = service.save(usuario);
        return ResponseEntity.ok(usuarioSalvo);  
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getById(@PathVariable Long id) {
        var usuario = service.getById(id);
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

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
