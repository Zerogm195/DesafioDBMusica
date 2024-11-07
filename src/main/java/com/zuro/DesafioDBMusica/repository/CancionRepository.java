package com.zuro.DesafioDBMusica.repository;

import com.zuro.DesafioDBMusica.modelo.Cancion;
import com.zuro.DesafioDBMusica.modelo.Cantante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CancionRepository extends JpaRepository <Cancion, Long> {
    Cancion findByTitulo(String nombreCancion);
}
