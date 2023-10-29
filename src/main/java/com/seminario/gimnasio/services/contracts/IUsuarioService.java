package com.seminario.gimnasio.services.contracts;
import com.seminario.gimnasio.entities.Usuario;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IUsuarioService {
    public ResponseEntity<List<Usuario>> findAll();

    public ResponseEntity<Usuario> create(Usuario usuario);

    public ResponseEntity<Usuario> update(Usuario usuario);

    public ResponseEntity<Boolean> delete(Long id);
}
