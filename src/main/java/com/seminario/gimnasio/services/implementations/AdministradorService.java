package com.seminario.gimnasio.services.implementations;
import com.seminario.gimnasio.entities.Administrador;
import com.seminario.gimnasio.repositories.contracts.IAdministradorRepository;
import com.seminario.gimnasio.services.contracts.IAdministradorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministradorService implements IAdministradorService {

    @Autowired
    private IAdministradorRepository administradorRepository;
    @Override
    public ResponseEntity<List<Administrador>> findAll() {
        try {
            List<Administrador> administradores = this.administradorRepository.findAll();
            return new ResponseEntity<List<Administrador>>(administradores, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Administrador> create(Administrador administrador) {
        try {
            Administrador administradorSaved = this.administradorRepository.save(administrador);
            return new ResponseEntity<Administrador>(administradorSaved, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Administrador>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Administrador> update(Administrador administrador) {
        try {
            Administrador administradorUpdated = this.administradorRepository.save(administrador);
            return new ResponseEntity<Administrador>(administradorUpdated, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Administrador>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        try {
            this.administradorRepository.deleteById(id);
            return new ResponseEntity<Boolean>(true, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<Boolean>(false, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity <Administrador> show(String correo, String contraseña){
        Administrador administrador = this.administradorRepository.mostrar(correo, contraseña);
        return new ResponseEntity<Administrador>(administrador, HttpStatus.OK);
    }

}

