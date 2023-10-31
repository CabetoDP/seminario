package com.seminario.gimnasio.services.implementations;
import com.seminario.gimnasio.entities.Gimnasio;
import com.seminario.gimnasio.repositories.contracts.IGimnasioRepository;
import com.seminario.gimnasio.services.contracts.IGimnasioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GimnasioService implements IGimnasioService {

    @Autowired
    private IGimnasioRepository gimnasioRepository;
    @Override
    public ResponseEntity<List<Gimnasio>> findAll() {
        try {
            List<Gimnasio> gimnasios = this.gimnasioRepository.findAll();
            return new ResponseEntity<List<Gimnasio>>(gimnasios, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Gimnasio> create(Gimnasio gimnasio) {
        try {
            Gimnasio gimnasioSaved = this.gimnasioRepository.save(gimnasio);
            return new ResponseEntity<Gimnasio>(gimnasioSaved, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Gimnasio>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Gimnasio> update(Gimnasio gimnasio) {
        try {
            Gimnasio gimnasioUpdated = this.gimnasioRepository.save(gimnasio);
            return new ResponseEntity<Gimnasio>(gimnasioUpdated, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Gimnasio>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        try {
            this.gimnasioRepository.deleteById(id);
            return new ResponseEntity<Boolean>(true, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<Boolean>(false, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
