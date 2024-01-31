package com.example.gestor.controlador;

import com.example.gestor.modelo.Actividad;
import com.example.gestor.servicio.ActividadServicio.ActividadServicioImplementado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("gestor-app")
public class ActividadControlador {
    @Autowired
    private ActividadServicioImplementado ActividadServicioImplementado;

    @GetMapping("/actividades")
    public ResponseEntity<List<Actividad>> obtenerActividades(){
        List<Actividad> actividades=this.ActividadServicioImplementado.lista_actividad();
        if (actividades!= null){
            return ResponseEntity.ok(actividades);
        }
        return ResponseEntity.badRequest().build();
    }
}
