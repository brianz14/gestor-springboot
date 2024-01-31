package com.example.gestor.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
@Table(name = "precio")
public class Precio {
    @Id
    private int id_precio;
    private String categoria_precio;
    private double cantidad_precio;


}
