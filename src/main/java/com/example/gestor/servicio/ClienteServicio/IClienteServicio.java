package com.example.gestor.servicio.ClienteServicio;

import com.example.gestor.modelo.Cliente;

import java.util.List;

public interface IClienteServicio {
    List<Cliente> lista_cliente();

    Cliente agregar_cliente(Cliente cliente);

    void eliminarCliente(String id);
}
