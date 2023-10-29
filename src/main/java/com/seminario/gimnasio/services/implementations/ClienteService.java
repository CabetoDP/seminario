package com.seminario.gimnasio.services.implementations;
import com.seminario.gimnasio.entities.Cliente;
import com.seminario.gimnasio.repositories.contracts.IClienteRepository;
import com.seminario.gimnasio.services.contracts.IClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private IClienteRepository clienteRepository;
    @Override
    public ResponseEntity<List<Cliente>> findAll() {
        try {
            List<Cliente> clientes = this.clienteRepository.findAll();
            return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Cliente> create(Cliente cliente) {
        try {
            Cliente clienteSaved = this.clienteRepository.save(cliente);
            return new ResponseEntity<Cliente>(clienteSaved, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Cliente>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Cliente> update(Cliente cliente) {
        try {
            Cliente clienteUpdated = this.clienteRepository.save(cliente);
            return new ResponseEntity<Cliente>(clienteUpdated, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Cliente>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        try {
            this.clienteRepository.deleteById(id);
            return new ResponseEntity<Boolean>(true, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<Boolean>(false, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
