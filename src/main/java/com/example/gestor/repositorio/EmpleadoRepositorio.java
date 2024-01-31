package com.example.gestor.repositorio;

import com.example.gestor.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepositorio extends JpaRepository<Empleado,Integer> {
}
