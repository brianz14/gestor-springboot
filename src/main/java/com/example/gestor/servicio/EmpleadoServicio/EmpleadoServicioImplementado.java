package com.example.gestor.servicio.EmpleadoServicio;

import com.example.gestor.modelo.Empleado;
import com.example.gestor.repositorio.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServicioImplementado implements IEmpleadoServicio {

    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;
    @Override
    public List<Empleado> lista_empleado() {
        List<Empleado> lista_empleado= this.empleadoRepositorio.findAll();
        return lista_empleado;
    }
}
