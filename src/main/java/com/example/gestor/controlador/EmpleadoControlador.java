package com.example.gestor.controlador;

import com.example.gestor.modelo.Empleado;
import com.example.gestor.servicio.EmpleadoServicio.EmpleadoServicioImplementado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("gestor-app")
public class EmpleadoControlador {

    @Autowired
    private EmpleadoServicioImplementado empleadoServicioImplementado;

    @GetMapping("/empleados")
    public ResponseEntity<List<Empleado>> obtenerEmpleados() {
        List<Empleado> empleados = this.empleadoServicioImplementado.lista_empleado();
        if (empleados != null) {
            return ResponseEntity.ok(empleados);
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/empleados_disponibles")
    public ResponseEntity<List<Empleado>> obtenerEmpleadosDisponibles() {
        List<Empleado> empleados = this.empleadoServicioImplementado.lista_empleado_disponibles();
        if (empleados != null) {
            return ResponseEntity.ok(empleados);
        }
        return ResponseEntity.badRequest().build();
    }

    @PostMapping("/empleados")
    public ResponseEntity<Empleado> agregarEmpleados(@RequestBody Empleado empleado) {
        if (empleado != null) {
            Empleado empleado1 = this.empleadoServicioImplementado.agregar_empleado(empleado);
            return ResponseEntity.ok(empleado1);
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/empleados/{id}")
    public ResponseEntity<Map<String, Boolean>> eliminarEmpleado(@PathVariable int id) {
        if (id > 0) {
            this.empleadoServicioImplementado.eliminarEmpleado(id);
            Map<String, Boolean> respuesta = new HashMap<>();
            respuesta.put("eliminado", Boolean.TRUE);
            return ResponseEntity.ok(respuesta);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }


    @GetMapping("/empleados_login/{email}/{contra}")
    public ResponseEntity<Empleado> loginEmpleado(@PathVariable String email, @PathVariable String contra) {
        if (!email.isEmpty() && !contra.isEmpty()) {
            Empleado empleado = this.empleadoServicioImplementado.empleado_login(email);
            if (empleado.getContra_emp().equals(contra)) {
                return ResponseEntity.ok(empleado);
            }
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/empleados_ultimo")
    public ResponseEntity<Empleado> ultimo_empleado() {

        Empleado empleado = this.empleadoServicioImplementado.ultimo_empleado();
        if (empleado!= null) {
            return ResponseEntity.ok(empleado);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
}
