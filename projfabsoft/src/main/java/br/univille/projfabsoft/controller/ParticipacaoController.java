package br.univille.projfabsoft.controller;

import br.univille.projfabsoft.entity.Participacao;
import br.univille.projfabsoft.service.ParticipacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/participacoes")
public class ParticipacaoController {

    @Autowired
    private ParticipacaoService participacaoService;

    @GetMapping
    public List<Participacao> getAllParticipacoes() {
        return participacaoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Participacao> getParticipacaoById(@PathVariable long id) {
        Optional<Participacao> participacao = participacaoService.findById(id);
        return participacao.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Participacao> createParticipacao(@RequestBody Participacao participacao) {
        Participacao savedParticipacao = participacaoService.save(participacao);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedParticipacao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Participacao> updateParticipacao(@PathVariable long id, @RequestBody Participacao participacao) {
        Optional<Participacao> existingParticipacao = participacaoService.findById(id);
        if (existingParticipacao.isPresent()) {
            participacao.setId(id);
            Participacao updatedParticipacao = participacaoService.save(participacao);
            return ResponseEntity.ok(updatedParticipacao);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteParticipacao(@PathVariable long id) {
        Optional<Participacao> participacao = participacaoService.findById(id);
        if (participacao.isPresent()) {
            participacaoService.delete(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
