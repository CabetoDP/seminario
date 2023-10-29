package com.seminario.gimnasio.services.contracts;
import com.seminario.gimnasio.entities.Gimnasio;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IGimnasioService {
    public ResponseEntity<List<Gimnasio>> findAll();

    public ResponseEntity<Gimnasio> create(Gimnasio gimnasio);

    public ResponseEntity<Gimnasio> update(Gimnasio gimnasio);

    public ResponseEntity<Boolean> delete(Long id);
}
