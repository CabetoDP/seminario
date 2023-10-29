package com.seminario.gimnasio.services.implementations;
import com.seminario.gimnasio.entities.ContratoEntrenador;
import com.seminario.gimnasio.repositories.contracts.IContratoEntrenadorRepository;
import com.seminario.gimnasio.services.contracts.IContratoEntrenadorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratoEntrenadorService implements IContratoEntrenadorService {

    @Autowired
    private IContratoEntrenadorRepository contratoEntrenadorRepository;
    @Override
    public ResponseEntity<List<ContratoEntrenador>> findAll() {
        try {
            List<ContratoEntrenador> contratosEntrenadores = this.contratoEntrenadorRepository.findAll();
            return new ResponseEntity<List<ContratoEntrenador>>(contratosEntrenadores, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<ContratoEntrenador> create(ContratoEntrenador contratoEntrenador) {
        try {
            ContratoEntrenador contratoEntrenadorSaved = this.contratoEntrenadorRepository.save(contratoEntrenador);
            return new ResponseEntity<ContratoEntrenador>(contratoEntrenadorSaved, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<ContratoEntrenador>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<ContratoEntrenador> update(ContratoEntrenador contratoEntrenador) {
        try {
            ContratoEntrenador contratoEntrenadorUpdated = this.contratoEntrenadorRepository.save(contratoEntrenador);
            return new ResponseEntity<ContratoEntrenador>(contratoEntrenadorUpdated, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<ContratoEntrenador>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        try {
            this.contratoEntrenadorRepository.deleteById(id);
            return new ResponseEntity<Boolean>(true, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<Boolean>(false, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
