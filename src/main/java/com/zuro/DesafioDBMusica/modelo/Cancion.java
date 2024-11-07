package com.zuro.DesafioDBMusica.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "canciones")

public class Cancion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String generoMusical;
    private Integer duracion;

    @ManyToOne
    @JoinColumn (name = "cantante_id")
    private Cantante cantante;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    @Override public String toString() {
        return "\nId: " + id + "\nTitulo : " + titulo + "\nGénero Musical : " + generoMusical + "\nDuración : " + duracion + " Minutos ";
    }
}
