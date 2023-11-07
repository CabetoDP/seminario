package com.seminario.gimnasio.services.implementations;
import com.seminario.gimnasio.entities.Entrenador;
import com.seminario.gimnasio.entities.Usuario;
import com.seminario.gimnasio.repositories.contracts.IEntrenadorRepository;
import com.seminario.gimnasio.responses.EntrenadorResponse;
import com.seminario.gimnasio.responses.UsuarioResponse;
import com.seminario.gimnasio.services.contracts.IEntrenadorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrenadorService implements IEntrenadorService {

    @Autowired
    private IEntrenadorRepository entrenadorRepository;
    @Override
    public ResponseEntity<List<Entrenador>> findAll() {
        try {
            List<Entrenador> entrenadores = this.entrenadorRepository.findAll();
            return new ResponseEntity<List<Entrenador>>(entrenadores, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Entrenador> create(Entrenador entrenador) {
        try {
            Entrenador entrenadorSaved = this.entrenadorRepository.save(entrenador);
            return new ResponseEntity<Entrenador>(entrenadorSaved, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Entrenador>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Entrenador> update(Entrenador entrenador) {
        try {
            Entrenador entrenadorUpdated = this.entrenadorRepository.save(entrenador);
            return new ResponseEntity<Entrenador>(entrenadorUpdated, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Entrenador>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        try {
            this.entrenadorRepository.deleteById(id);
            return new ResponseEntity<Boolean>(true, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<Boolean>(false, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Entrenador> mostrar (String correo, String contraseña){
        Entrenador entrenador = this.entrenadorRepository.mostrar(correo, contraseña);
        return new ResponseEntity<Entrenador>(entrenador, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EntrenadorResponse> mostrarPerfil (long id){
        EntrenadorResponse entrenador = this.entrenadorRepository.mostrarPerfil(id);
        return new ResponseEntity<EntrenadorResponse>(entrenador, HttpStatus.OK);
    } 
}
