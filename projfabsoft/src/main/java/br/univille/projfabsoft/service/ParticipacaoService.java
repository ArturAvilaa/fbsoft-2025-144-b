package br.univille.projfabsoft.service;

import br.univille.projfabsoft.entity.Participacao;
import java.util.List;
import java.util.Optional;

public interface ParticipacaoService {
    Participacao save(Participacao participacao);
    void delete(long id);
    Optional<Participacao> findById(long id);
    List<Participacao> findAll();
}
