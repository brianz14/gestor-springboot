package com.example.gestor.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
@Table(name = "cliente")
public class Cliente {

    @Id
    private String nrodoc_cli;
    private String nombre_cli;
    private String apellido_cli;
    private String correo_cli;
    private String contra_cli;

}
