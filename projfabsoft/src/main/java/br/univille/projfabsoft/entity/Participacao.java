package br.univille.projfabsoft.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Participacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Evento evento;

    private boolean confirmado;

    // Getters e Setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
    public Evento getEvento() { return evento; }
    public void setEvento(Evento evento) { this.evento = evento; }
    public boolean isConfirmado() { return confirmado; }
    public void setConfirmado(boolean confirmado) { this.confirmado = confirmado; }
}