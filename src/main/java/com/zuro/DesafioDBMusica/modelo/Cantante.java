package com.zuro.DesafioDBMusica.modelo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "cantantes")

public class Cantante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String genero;
    private  String nacionalidad;
    @OneToMany(mappedBy = "cantante")
    private List<Cancion> cancion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "\nId : " + id +"\nNombre : " + nombre + "\nGénero: "+ genero +"\nNacionalidad: "+ nacionalidad;
    }
}
