package com.example.gestor.servicio.ActividadServicio;

import com.example.gestor.modelo.Actividad;
import com.example.gestor.modelo.Cliente;

import java.util.List;

public interface IActividadServicio {
    List<Actividad> lista_actividad();

    List<Actividad> actividadesCercanas();

    Actividad agregar_actividad(Actividad actividad);

    void eliminarActividad(int id);


}
