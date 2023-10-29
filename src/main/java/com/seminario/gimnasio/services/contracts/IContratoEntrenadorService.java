package com.seminario.gimnasio.services.contracts;
import com.seminario.gimnasio.entities.ContratoEntrenador;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IContratoEntrenadorService {
    public ResponseEntity<List<ContratoEntrenador>> findAll();

    public ResponseEntity<ContratoEntrenador> create(ContratoEntrenador contratoEntrenador);

    public ResponseEntity<ContratoEntrenador> update(ContratoEntrenador contratoEntrenador);

    public ResponseEntity<Boolean> delete(Long id);
}