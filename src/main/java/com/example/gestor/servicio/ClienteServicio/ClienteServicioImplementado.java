package com.example.gestor.servicio.ClienteServicio;

import com.example.gestor.modelo.Cliente;
import com.example.gestor.repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServicioImplementado implements IClienteServicio {

    @Autowired
    private ClienteRepositorio clienteRepositorio;
    @Override
    public List<Cliente> lista_cliente() {
        List<Cliente> lista_cliente= this.clienteRepositorio.findAll();
        return lista_cliente;
    }

    @Override
    public Cliente agregar_cliente(Cliente cliente) {
        return this.clienteRepositorio.save(cliente);
    }


    @Override
    public void eliminarCliente(String id) {
        this.clienteRepositorio.deleteById(id);
    }


}
