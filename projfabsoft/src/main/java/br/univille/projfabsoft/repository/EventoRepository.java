package br.univille.projfabsoft.repository;

import br.univille.projfabsoft.entity.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
    // Aqui você pode adicionar consultas personalizadas, se necessário
}
