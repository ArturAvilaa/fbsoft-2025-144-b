package br.univille.projfabsoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projfabsoft.entity.Usuario;
import br.univille.projfabsoft.repository.UsuarioRepository;
import br.univille.projfabsoft.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Override   
    public List<Usuario> getAllUsuarios() {
        return repository.findAll(); 
    }

    @Override
    public Usuario save(Usuario usuario) {
        return repository.save(usuario);  
    }

    @Override
    public Usuario getById(Long id) {  
        return repository.findById(id).orElse(null);  
    }

    @Override
    public Usuario update(Long id, Usuario usuario) {  
        Usuario existingUsuario = getById(id);  
        if (existingUsuario != null) {
            existingUsuario.setNome(usuario.getNome());  
            existingUsuario.setEmail(usuario.getEmail());  
            existingUsuario.setSenha(usuario.getSenha());  
            return repository.save(existingUsuario);  
        }
        return null; 
    }
    @Override
    public Usuario delete(Long id) {  
        Usuario usuario = getById(id);
        if (usuario != null) {
            repository.delete(usuario);  
            return usuario;  
        }
        return null; 
    }
}
