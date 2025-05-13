package br.univille.projfabsoft.repository;

import br.univille.projfabsoft.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
    // Aqui você pode adicionar consultas personalizadas, se necessário
}
