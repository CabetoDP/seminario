package com.seminario.gimnasio.services.implementations;
import com.seminario.gimnasio.entities.Mensaje;
import com.seminario.gimnasio.repositories.contracts.IMensajeRepository;
import com.seminario.gimnasio.services.contracts.IMensajeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MensajeService implements IMensajeService {

    @Autowired
    private IMensajeRepository mensajeRepository;
    @Override
    public ResponseEntity<List<Mensaje>> findAll() {
        try {
            List<Mensaje> mensajes = this.mensajeRepository.findAll();
            return new ResponseEntity<List<Mensaje>>(mensajes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Mensaje> create(Mensaje mensaje) {
        try {
            Mensaje mensajeSaved = this.mensajeRepository.save(mensaje);
            return new ResponseEntity<Mensaje>(mensajeSaved, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Mensaje>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Mensaje> update(Mensaje mensaje) {
        try {
            Mensaje mensajeUpdated = this.mensajeRepository.save(mensaje);
            return new ResponseEntity<Mensaje>(mensajeUpdated, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Mensaje>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        try {
            this.mensajeRepository.deleteById(id);
            return new ResponseEntity<Boolean>(true, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<Boolean>(false, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
