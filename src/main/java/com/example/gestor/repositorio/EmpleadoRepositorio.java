package com.example.gestor.repositorio;

import com.example.gestor.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface EmpleadoRepositorio extends JpaRepository<Empleado,Integer> {

    @Query(value = "select e1  from empleado e1 where cod_emp not in ( select cod_emp from actividad)",nativeQuery = true)
    List<Empleado> lista_empleado_disponible();

    @Query(value = "select * from empleado e1 where e1.correo_emp=:email  ",nativeQuery = true)
    Empleado empleado_login(@Param("email") String email);

    @Query(value = "select * from empleado e1 order by e1.cod_emp desc limit 1 ",nativeQuery = true)
    Empleado ultimo_empleado();


}
