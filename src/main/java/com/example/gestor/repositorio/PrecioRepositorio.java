package com.example.gestor.repositorio;

import com.example.gestor.modelo.Precio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrecioRepositorio extends JpaRepository<Precio,Integer> {
}
