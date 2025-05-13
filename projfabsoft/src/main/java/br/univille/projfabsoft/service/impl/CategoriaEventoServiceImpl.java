package br.univille.projfabsoft.service.impl;

import br.univille.projfabsoft.entity.CategoriaEvento;
import br.univille.projfabsoft.repository.CategoriaEventoRepository;
import br.univille.projfabsoft.service.CategoriaEventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaEventoServiceImpl implements CategoriaEventoService {

    @Autowired
    private CategoriaEventoRepository categoriaEventoRepository;

    @Override
    public CategoriaEvento save(CategoriaEvento categoriaEvento) {
        return categoriaEventoRepository.save(categoriaEvento);
    }

    @Override
    public void delete(long id) {
        categoriaEventoRepository.deleteById(id);
    }

    @Override
    public Optional<CategoriaEvento> findById(long id) {
        return categoriaEventoRepository.findById(id);
    }

    @Override
    public List<CategoriaEvento> findAll() {
        return categoriaEventoRepository.findAll();
    }
}

