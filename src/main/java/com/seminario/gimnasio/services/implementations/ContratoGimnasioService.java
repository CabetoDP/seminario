package com.seminario.gimnasio.services.implementations;
import com.seminario.gimnasio.entities.ContratoGimnasio;
import com.seminario.gimnasio.repositories.contracts.IContratoGimnasioRepository;
import com.seminario.gimnasio.services.contracts.IContratoGimnasioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratoGimnasioService implements IContratoGimnasioService {

    @Autowired
    private IContratoGimnasioRepository contratoGimnasioRepository;
    @Override
    public ResponseEntity<List<ContratoGimnasio>> findAll() {
        try {
            List<ContratoGimnasio> contratosGimnasios = this.contratoGimnasioRepository.findAll();
            return new ResponseEntity<List<ContratoGimnasio>>(contratosGimnasios, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<ContratoGimnasio> create(ContratoGimnasio contratoGimnasio) {
        try {
            ContratoGimnasio contratoGimnasioSaved = this.contratoGimnasioRepository.save(contratoGimnasio);
            return new ResponseEntity<ContratoGimnasio>(contratoGimnasioSaved, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<ContratoGimnasio>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<ContratoGimnasio> update(ContratoGimnasio contratoGimnasio) {
        try {
            ContratoGimnasio contratoGimnasioUpdated = this.contratoGimnasioRepository.save(contratoGimnasio);
            return new ResponseEntity<ContratoGimnasio>(contratoGimnasioUpdated, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<ContratoGimnasio>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        try {
            this.contratoGimnasioRepository.deleteById(id);
            return new ResponseEntity<Boolean>(true, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<Boolean>(false, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}