package br.univille.projfabsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.projfabsoft.entity.Papel;
import br.univille.projfabsoft.service.PapelService;

@RestController
@RequestMapping("/api/v1/papeis")
public class PapelController {

    @Autowired
    private PapelService papelService;

    @GetMapping
    public List<Papel> listarTodos() {
        return papelService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Papel> buscarPorId(@PathVariable Long id) {
        Papel papel = papelService.getById(id);
        if (papel == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(papel);
    }

    @PostMapping
    public Papel criar(@RequestBody Papel papel) {
        return papelService.save(papel);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Papel> atualizar(@PathVariable Long id, @RequestBody Papel papel) {
        Papel existente = papelService.getById(id);
        if (existente == null) {
            return ResponseEntity.notFound().build();
        }
        papel.setId(id);
        return ResponseEntity.ok(papelService.save(papel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        Papel existente = papelService.getById(id);
        if (existente == null) {
            return ResponseEntity.notFound().build();
        }
        papelService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
