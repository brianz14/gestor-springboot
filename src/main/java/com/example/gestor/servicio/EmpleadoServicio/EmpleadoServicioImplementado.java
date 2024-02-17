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

    @Override
    public List<Empleado> lista_empleado_disponibles() {
        List<Empleado> lista_empleado_disponible= this.empleadoRepositorio.findAll();
        return lista_empleado_disponible;
    }

    @Override
    public Empleado agregar_empleado(Empleado empleado) {
        return this.empleadoRepositorio.save(empleado);
    }

    @Override
    public Empleado empleado_login(String email) {
        Empleado empleado= this.empleadoRepositorio.empleado_login(email);
        return empleado;
    }

    @Override
    public Empleado ultimo_empleado() {
        Empleado empleado= this.empleadoRepositorio.ultimo_empleado();
        return empleado;
    }

    @Override
    public long totalEmpleados() {
        return this.empleadoRepositorio.count();
    }

    @Override
    public void eliminarEmpleado(int id) {
        this.empleadoRepositorio.deleteById(id);
    }
}
