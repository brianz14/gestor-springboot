package com.example.gestor.repositorio;

import com.example.gestor.modelo.Cliente;
import com.example.gestor.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClienteRepositorio extends JpaRepository<Cliente,String> {

    @Query(value = "select c1.nrodoc_cli,c1.nombre_cli,c1.apellido_cli, c1.correo_cli,c1.contra_cli from cliente c1 inner join actividad a2 on c1.nrodoc_cli=a2.nro_doc_cli group by c1.nrodoc_cli order by sum(precio_total) desc limit 1 ", nativeQuery = true)
    Cliente cliente_mas_frecuente();

}
