package br.univille.projfabsoft.repository;

import br.univille.projfabsoft.entity.Participacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipacaoRepository extends JpaRepository<Participacao, Long> {
    // Aqui você pode adicionar consultas personalizadas, se necessário
}

