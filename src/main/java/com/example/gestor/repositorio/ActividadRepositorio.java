package com.example.gestor.repositorio;

import com.example.gestor.modelo.Actividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ActividadRepositorio extends JpaRepository<Actividad,Integer> {

    @Query(value = "select * from actividad order by fecha_inicio_acti limit 5",nativeQuery = true)
    List<Actividad> actividadesCercanas();
}
