package com.example.gestor.repositorio;

import com.example.gestor.modelo.Actividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ActividadRepositorio extends JpaRepository<Actividad,Integer> {

    @Query(value = "select * from actividad order by fecha_inicio_acti limit 4",nativeQuery = true)
    List<Actividad> actividadesCercanas();

    @Query(value = "select sum(precio_total) from actividad",nativeQuery = true)
    int recaudacionTotal();
}
