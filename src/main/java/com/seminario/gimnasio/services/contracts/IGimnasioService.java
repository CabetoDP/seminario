package com.seminario.gimnasio.services.contracts;
import com.seminario.gimnasio.entities.Gimnasio;
import com.seminario.gimnasio.responses.GimnasioResponse;
import com.seminario.gimnasio.responses.UsuarioResponse;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IGimnasioService {
    public ResponseEntity<List<Gimnasio>> findAll();

    public ResponseEntity<Gimnasio> create(Gimnasio gimnasio);

    public ResponseEntity<Gimnasio> update(Gimnasio gimnasio);

    public ResponseEntity<Boolean> delete(Long id);

    public ResponseEntity<Gimnasio> show(long id);

    public ResponseEntity <Gimnasio> search(String busqueda);
}
