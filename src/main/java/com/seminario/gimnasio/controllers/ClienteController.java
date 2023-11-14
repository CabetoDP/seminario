package com.seminario.gimnasio.controllers;

import com.seminario.gimnasio.entities.Cliente;
import com.seminario.gimnasio.requests.IdRequest;
import com.seminario.gimnasio.requests.LoginRequest;
import com.seminario.gimnasio.responses.ClienteResponse;
import com.seminario.gimnasio.services.contracts.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping("/list")
    private ResponseEntity<List<Cliente>> getAllClientes() {
        return this.clienteService.findAll();
    }

    @PostMapping("/create")
    private  ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
        return this.clienteService.create(cliente);
    }

    @PutMapping("/update")
    private ResponseEntity<Cliente> updateCliente(@RequestBody Cliente cliente) {
        return this.clienteService.update(cliente);
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Boolean> deleteCliente(@RequestBody Long id) {
        return this.clienteService.delete(id);
    }

    @PostMapping("/show")
    private ResponseEntity<Cliente> show(@RequestBody LoginRequest login) {
        return this.clienteService.show(login.correo, login.contraseña);
    }

    @PostMapping("/showProfile")
    private ResponseEntity<ClienteResponse> showProfile(@RequestBody IdRequest id) {
        return this.clienteService.showProfile(id.id);
    }
}
