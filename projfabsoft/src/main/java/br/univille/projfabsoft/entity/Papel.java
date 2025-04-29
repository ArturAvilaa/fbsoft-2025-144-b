package br.univille.projfabsoft.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Papel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;

    @ManyToMany()
    private List<Usuario> usuarios;

    // Getters e Setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public List<Usuario> getUsuarios() { return usuarios; }
    public void setUsuarios(List<Usuario> usuarios) { this.usuarios = usuarios; }
}