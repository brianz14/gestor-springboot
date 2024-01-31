package com.example.gestor.modelo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Data
@ToString
@Table(name = "actividad")
public class Actividad {

    @Id
    private int id_acti;
    private String descripcion_acti;
    private LocalDate fecha_inicio_acti;
    private LocalDate fecha_fin_acti;
    private int nro_participantes;

    @ManyToOne
    @JoinColumn(name = "nro_doc_cli")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "cod_emp")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "id_precio")
    private Precio precio;
}
