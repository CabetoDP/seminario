package com.seminario.gimnasio.services.contracts;
import com.seminario.gimnasio.entities.Cliente;
import com.seminario.gimnasio.entities.Entrenador;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IEntrenadorService {
    public ResponseEntity<List<Entrenador>> findAll();

    public ResponseEntity<Entrenador> create(Entrenador entrenador);

    public ResponseEntity<Entrenador> update(Entrenador entrenador);

    public ResponseEntity<Boolean> delete(Long id);
    
    public ResponseEntity <Entrenador> mostrar(String correo, String contraseña);

    public ResponseEntity <EntrenadorResponse> mostrarPerfil(String correo, String contraseña);
}
