package com.example.gestor.repositorio;

import com.example.gestor.modelo.Actividad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActividadRepositorio extends JpaRepository<Actividad,Integer> {
}
