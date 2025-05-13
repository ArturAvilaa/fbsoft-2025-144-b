package br.univille.projfabsoft.service;

import br.univille.projfabsoft.entity.Evento;
import java.util.List;
import java.util.Optional;

public interface EventoService {
    Evento save(Evento evento);
    void delete(long id);
    Optional<Evento> findById(long id);
    List<Evento> findAll();
}
