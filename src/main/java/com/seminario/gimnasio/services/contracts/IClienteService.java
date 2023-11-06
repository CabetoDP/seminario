package com.seminario.gimnasio.services.contracts;
import com.seminario.gimnasio.entities.Cliente;
import com.seminario.gimnasio.responses.ClienteResponse;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IClienteService {
    public ResponseEntity<List<Cliente>> findAll();

    public ResponseEntity<Cliente> create(Cliente cliente);

    public ResponseEntity<Cliente> update(Cliente cliente);

    public ResponseEntity<Boolean> delete(Long id);

    public ResponseEntity <Cliente> mostrar(String correo, String contraseña);

    public ResponseEntity <ClienteResponse> mostrarPerfil(String correo, String contraseña);
}