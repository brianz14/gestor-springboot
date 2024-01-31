package com.example.gestor.controlador;

import com.example.gestor.modelo.Cliente;
import com.example.gestor.modelo.Empleado;
import com.example.gestor.servicio.EmpleadoServicio.EmpleadoServicioImplementado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("gestor-app")
public class EmpleadoControlador {

    @Autowired
    private EmpleadoServicioImplementado empleadoServicioImplementadoe;
    @GetMapping("/empleados")
    public ResponseEntity<List<Empleado>> obtenerEmpleados(){
        List<Empleado> empleados=this.empleadoServicioImplementadoe.lista_empleado();
        if (empleados!= null){
            return ResponseEntity.ok(empleados);
        }
        return ResponseEntity.badRequest().build();
    }
}
