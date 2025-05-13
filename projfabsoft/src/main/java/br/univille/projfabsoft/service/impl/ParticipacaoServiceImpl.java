package br.univille.projfabsoft.service.impl;

import br.univille.projfabsoft.entity.Participacao;
import br.univille.projfabsoft.repository.ParticipacaoRepository;
import br.univille.projfabsoft.service.ParticipacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParticipacaoServiceImpl implements ParticipacaoService {

    @Autowired
    private ParticipacaoRepository participacaoRepository;

    @Override
    public Participacao save(Participacao participacao) {
        return participacaoRepository.save(participacao);
    }

    @Override
    public void delete(long id) {
        participacaoRepository.deleteById(id);
    }

    @Override
    public Optional<Participacao> findById(long id) {
        return participacaoRepository.findById(id);
    }

    @Override
    public List<Participacao> findAll() {
        return participacaoRepository.findAll();
    }
}
