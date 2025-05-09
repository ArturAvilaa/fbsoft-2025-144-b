package br.univille.projfabsoft.service;

import java.util.List;

import br.univille.projfabsoft.entity.Usuario;

public interface UsuarioService {
    Usuario save(Usuario usuario);
    List<Usuario> getAllUsuarios();
    Usuario getById(Long id);
    Usuario update(Long id, Usuario usuario);
    Usuario delete(Long id);
}
