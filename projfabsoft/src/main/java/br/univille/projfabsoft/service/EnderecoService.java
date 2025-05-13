package br.univille.projfabsoft.service;

import br.univille.projfabsoft.entity.Endereco;
import java.util.List;
import java.util.Optional;

public interface EnderecoService {
    Endereco save(Endereco endereco);
    void delete(long id);
    Optional<Endereco> findById(long id);
    List<Endereco> findAll();
}
