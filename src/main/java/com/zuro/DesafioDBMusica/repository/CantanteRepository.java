package com.zuro.DesafioDBMusica.repository;

import com.zuro.DesafioDBMusica.modelo.Cantante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CantanteRepository extends JpaRepository <Cantante, Long> {
    Cantante findByNombre(String nombre);
}
