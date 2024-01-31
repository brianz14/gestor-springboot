package com.example.gestor.servicio.PrecioServicio;

import com.example.gestor.modelo.Precio;
import com.example.gestor.repositorio.PrecioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrecioServicioImplementado implements IPrecioServicio{

    @Autowired
    private PrecioRepositorio precioRepositorio;

    @Override
    public List<Precio> lista_precios() {
        List<Precio> lista_precio =this.precioRepositorio.findAll();
        return lista_precio;
    }
}
