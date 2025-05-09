package br.univille.projfabsoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.univille.projfabsoft.entity.Papel;

public interface PapelRepository extends JpaRepository<Papel, Long> {
}
