package com.seminario.gimnasio.services.contracts;
import com.seminario.gimnasio.entities.Administrador;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IAdministradorService {
    public ResponseEntity<List<Administrador>> findAll();

    public ResponseEntity<Administrador> create(Administrador administrador);

    public ResponseEntity<Administrador> update(Administrador administrador);

    public ResponseEntity<Boolean> delete(Long id);
}
