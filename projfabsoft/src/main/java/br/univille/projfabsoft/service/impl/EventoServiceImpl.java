package br.univille.projfabsoft.service.impl;

import br.univille.projfabsoft.entity.Evento;
import br.univille.projfabsoft.repository.EventoRepository;
import br.univille.projfabsoft.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoServiceImpl implements EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    @Override
    public Evento save(Evento evento) {
        return eventoRepository.save(evento);
    }

    @Override
    public void delete(long id) {
        eventoRepository.deleteById(id);
    }

    @Override
    public Optional<Evento> findById(long id) {
        return eventoRepository.findById(id);
    }

    @Override
    public List<Evento> findAll() {
        return eventoRepository.findAll();
    }
}
