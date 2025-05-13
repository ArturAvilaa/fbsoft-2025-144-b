package br.univille.projfabsoft.service;

import br.univille.projfabsoft.entity.CategoriaEvento;
import java.util.List;
import java.util.Optional;

public interface CategoriaEventoService {
    CategoriaEvento save(CategoriaEvento categoriaEvento);
    void delete(long id);
    Optional<CategoriaEvento> findById(long id);
    List<CategoriaEvento> findAll();
}
