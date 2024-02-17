package com.example.gestor.controlador;

import com.example.gestor.modelo.Actividad;
import com.example.gestor.modelo.Cliente;
import com.example.gestor.servicio.ActividadServicio.ActividadServicioImplementado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("gestor-app")
public class ActividadControlador {
    @Autowired  
    private ActividadServicioImplementado actividadServicioImplementado;

    @GetMapping("/actividades")
    public ResponseEntity<List<Actividad>> obtenerActividades(){
        List<Actividad> actividades=this.actividadServicioImplementado.lista_actividad();
        if (actividades!= null){
            return ResponseEntity.ok(actividades);
        }
        return ResponseEntity.badRequest().build();
    }


    @GetMapping("/actividades_cercanas")
    public ResponseEntity<List<Actividad>> obtenerActividadesCercanas(){
        List<Actividad> actividades=this.actividadServicioImplementado.actividadesCercanas();
        if (actividades!= null){
            return ResponseEntity.ok(actividades);
        }
        return ResponseEntity.badRequest().build();
    }


    @PostMapping("/actividades")
    public ResponseEntity<Actividad> agregarActividad(@RequestBody Actividad actividad ){
        if (actividad!= null){
            Actividad actividad1=this.actividadServicioImplementado.agregar_actividad(actividad);
            return ResponseEntity.ok(actividad1);
        }
        return ResponseEntity.badRequest().build();
    }


    @GetMapping("/actividades_total")
    public long totalActividades(){
        long total= this.actividadServicioImplementado.total_actividades();
        return  total;
    }

    @GetMapping("/actividades_recaudacion")
    public int totalRecaudacionActividad(){
        int total= this.actividadServicioImplementado.recaudacion_total();
        return  total;
    }



    @DeleteMapping("/actividades/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarActividad(@PathVariable int id){
        if (id!=-1){
            this.actividadServicioImplementado.eliminarActividad(id);
            Map<String,Boolean> respuesta = new HashMap<>();
            respuesta.put("eliminado",Boolean.TRUE);
            return ResponseEntity.ok(respuesta);
        }else{
            return  ResponseEntity.badRequest().build();
            //mensaje
        }
    }
}
