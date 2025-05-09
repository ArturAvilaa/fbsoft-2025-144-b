package br.univille.projfabsoft.service;

import java.util.List;
import br.univille.projfabsoft.entity.Papel;

public interface PapelService {
    List<Papel> getAll();
    Papel getById(Long id);
    Papel save(Papel papel);
    void delete(Long id);
}
