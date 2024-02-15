package com.example.gestor.servicio.ClienteServicio;

import com.example.gestor.modelo.Cliente;

import java.util.List;

public interface IClienteServicio {
    List<Cliente> lista_cliente();

    Cliente agregar_cliente(Cliente cliente);

    Cliente cliente_mas_frecuente();

    void eliminarCliente(String id);
}
