package com.example.gestor.servicio.EmpleadoServicio;

import com.example.gestor.modelo.Cliente;
import com.example.gestor.modelo.Empleado;

import java.util.List;

public interface IEmpleadoServicio {
    List<Empleado> lista_empleado();
    List<Empleado> lista_empleado_disponibles();

    Empleado agregar_empleado(Empleado empleado);

    Empleado empleado_login(String email);

    Empleado  ultimo_empleado();
    void eliminarEmpleado(int id);
}
