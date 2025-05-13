package br.univille.projfabsoft.controller;

import br.univille.projfabsoft.entity.Evento;
import br.univille.projfabsoft.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @GetMapping
    public List<Evento> getAllEventos() {
        return eventoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Evento> getEventoById(@PathVariable long id) {
        Optional<Evento> evento = eventoService.findById(id);
        return evento.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Evento> createEvento(@RequestBody Evento evento) {
        Evento savedEvento = eventoService.save(evento);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEvento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Evento> updateEvento(@PathVariable long id, @RequestBody Evento evento) {
        Optional<Evento> existingEvento = eventoService.findById(id);
        if (existingEvento.isPresent()) {
            evento.setId(id);
            Evento updatedEvento = eventoService.save(evento);
            return ResponseEntity.ok(updatedEvento);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvento(@PathVariable long id) {
        Optional<Evento> evento = eventoService.findById(id);
        if (evento.isPresent()) {
            eventoService.delete(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
