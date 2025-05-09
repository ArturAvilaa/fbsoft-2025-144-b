package br.univille.projfabsoft.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projfabsoft.entity.Papel;
import br.univille.projfabsoft.repository.PapelRepository;
import br.univille.projfabsoft.service.PapelService;

@Service
public class PapelServiceImpl implements PapelService {

    @Autowired
    private PapelRepository papelRepository;

    @Override
    public List<Papel> getAll() {
        return papelRepository.findAll();
    }

    @Override
    public Papel getById(Long id) {
        Optional<Papel> papel = papelRepository.findById(id);
        return papel.orElse(null);
    }

    @Override
    public Papel save(Papel papel) {
        return papelRepository.save(papel);
    }

    @Override
    public void delete(Long id) {
        papelRepository.deleteById(id);
    }
}