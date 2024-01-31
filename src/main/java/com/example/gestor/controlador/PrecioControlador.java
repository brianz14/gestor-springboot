package com.example.gestor.controlador;

import com.example.gestor.modelo.Empleado;
import com.example.gestor.modelo.Precio;
import com.example.gestor.servicio.EmpleadoServicio.EmpleadoServicioImplementado;
import com.example.gestor.servicio.PrecioServicio.PrecioServicioImplementado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("gestor-app")
public class PrecioControlador {
    @Autowired
    private PrecioServicioImplementado precioServicioImplementado;
    @GetMapping("/precios")
    public ResponseEntity<List<Precio>> obtenerEmpleados(){
        List<Precio> precios=this.precioServicioImplementado.lista_precios();
        if (precios!= null){
            return ResponseEntity.ok(precios);
        }
        return ResponseEntity.badRequest().build();
    }
}
