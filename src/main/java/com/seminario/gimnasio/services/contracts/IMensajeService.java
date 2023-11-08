package com.seminario.gimnasio.services.contracts;
import com.seminario.gimnasio.entities.Mensaje;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IMensajeService {
    public ResponseEntity<List<Mensaje>> findAll();

    public ResponseEntity<Mensaje> create(Mensaje mensaje);

    public ResponseEntity<Mensaje> update(Mensaje mensaje);

    public ResponseEntity<Boolean> delete(Long id);

    public ResponseEntity<List<Mensaje>> chatBetweenUsers(String correoLogeado, String contraseñaLogeado, Long id);
}
