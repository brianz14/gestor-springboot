package com.example.gestor.controlador;

import com.example.gestor.modelo.Cliente;
import com.example.gestor.servicio.ClienteServicio.ClienteServicioImplementado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("gestor-app")
public class ClienteControlador {
    @Autowired
    private ClienteServicioImplementado clienteServicioImplementado;

    @GetMapping("/clientes")
    public ResponseEntity<List<Cliente>> obtenerClientes(){
        List<Cliente> clientes=this.clienteServicioImplementado.lista_cliente();
        if (clientes!= null){
            return ResponseEntity.ok(clientes);
        }
        return ResponseEntity.badRequest().build();
    }

    @PostMapping("/clientes")
    public ResponseEntity<Cliente> agregarClientes(@RequestBody Cliente cliente ){
        if (cliente!= null){
            Cliente cliente1= this.clienteServicioImplementado.agregar_cliente(cliente);
            return ResponseEntity.ok(cliente1);
        }
        return ResponseEntity.badRequest().build();
    }
    @DeleteMapping("/clientes/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarCliente(@PathVariable String id){
        if (id!=null){
            this.clienteServicioImplementado.eliminarCliente(id);
            Map<String,Boolean> respuesta = new HashMap<>();
            respuesta.put("eliminado",Boolean.TRUE);
            return ResponseEntity.ok(respuesta);
        }else{
            return  ResponseEntity.badRequest().build();
            //mensaje
        }
    }

    @GetMapping("/clientes_total")
    public long totalClientes(){
        long total = this.clienteServicioImplementado.total_clientes();
        return total;
    }

    @GetMapping("/clientes_frecuente")
    public ResponseEntity<Cliente> cliente_mas_frecuente(){
        Cliente cliente1= this.clienteServicioImplementado.cliente_mas_frecuente();
        if (cliente1!= null){
            return ResponseEntity.ok(cliente1);
        }
        return ResponseEntity.badRequest().build();
    }
}
