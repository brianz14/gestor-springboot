package com.example.gestor.servicio.ActividadServicio;

import com.example.gestor.modelo.Actividad;
import com.example.gestor.repositorio.ActividadRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActividadServicioImplementado implements IActividadServicio {
    @Autowired
    private ActividadRepositorio actividadRepositorio;
    @Override
    public List<Actividad> lista_actividad() {
        List<Actividad> lista_actividad= this.actividadRepositorio.findAll();
        return lista_actividad;
    }
}
