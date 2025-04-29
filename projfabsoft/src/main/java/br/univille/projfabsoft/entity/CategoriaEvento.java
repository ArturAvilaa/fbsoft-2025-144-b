package br.univille.projfabsoft.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class CategoriaEvento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;

    @OneToMany()
    @JoinColumn(name = "categoriaevento_id")
    private List<Evento> eventos = new ArrayList<>();

    // Getters e Setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public List<Evento> getEventos() { return eventos; }
    public void setEventos(List<Evento> eventos) { this.eventos = eventos; }
}