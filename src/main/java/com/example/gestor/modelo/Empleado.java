package com.example.gestor.modelo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@ToString
@Getter
@Setter
@Table(name = "empleado")
public class Empleado {

    @Id
    private int cod_emp;

    private String nombre_emp;
    private  String nro_doc_emp;
    private String cargo_emp;
    private String correo_emp;
    private String contra_emp;

}
