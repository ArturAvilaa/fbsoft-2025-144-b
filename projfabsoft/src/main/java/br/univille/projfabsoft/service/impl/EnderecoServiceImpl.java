package br.univille.projfabsoft.service.impl;

import br.univille.projfabsoft.entity.Endereco;
import br.univille.projfabsoft.repository.EnderecoRepository;
import br.univille.projfabsoft.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    public Endereco save(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    @Override
    public void delete(long id) {
        enderecoRepository.deleteById(id);
    }

    @Override
    public Optional<Endereco> findById(long id) {
        return enderecoRepository.findById(id);
    }

    @Override
    public List<Endereco> findAll() {
        return enderecoRepository.findAll();
    }
}
