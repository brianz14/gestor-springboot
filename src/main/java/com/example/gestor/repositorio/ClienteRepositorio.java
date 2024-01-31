package com.example.gestor.repositorio;

import com.example.gestor.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<Cliente,String> {
}
