package br.univille.projfabsoft.repository;

import br.univille.projfabsoft.entity.CategoriaEvento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaEventoRepository extends JpaRepository<CategoriaEvento, Long> {
    // Aqui você pode adicionar consultas personalizadas, se necessário
}
