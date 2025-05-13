package br.univille.projfabsoft.controller;

import br.univille.projfabsoft.entity.CategoriaEvento;
import br.univille.projfabsoft.service.CategoriaEventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias-evento")
public class CategoriaEventoController {

    @Autowired
    private CategoriaEventoService categoriaEventoService;

    @GetMapping
    public List<CategoriaEvento> getAllCategoriasEvento() {
        return categoriaEventoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaEvento> getCategoriaEventoById(@PathVariable long id) {
        Optional<CategoriaEvento> categoriaEvento = categoriaEventoService.findById(id);
        return categoriaEvento.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<CategoriaEvento> createCategoriaEvento(@RequestBody CategoriaEvento categoriaEvento) {
        CategoriaEvento savedCategoriaEvento = categoriaEventoService.save(categoriaEvento);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCategoriaEvento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoriaEvento> updateCategoriaEvento(@PathVariable long id, @RequestBody CategoriaEvento categoriaEvento) {
        Optional<CategoriaEvento> existingCategoriaEvento = categoriaEventoService.findById(id);
        if (existingCategoriaEvento.isPresent()) {
            categoriaEvento.setId(id);
            CategoriaEvento updatedCategoriaEvento = categoriaEventoService.save(categoriaEvento);
            return ResponseEntity.ok(updatedCategoriaEvento);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategoriaEvento(@PathVariable long id) {
        Optional<CategoriaEvento> categoriaEvento = categoriaEventoService.findById(id);
        if (categoriaEvento.isPresent()) {
            categoriaEventoService.delete(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
