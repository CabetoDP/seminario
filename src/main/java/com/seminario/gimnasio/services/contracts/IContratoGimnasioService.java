package com.seminario.gimnasio.services.contracts;
import com.seminario.gimnasio.entities.ContratoGimnasio;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IContratoGimnasioService {
    public ResponseEntity<List<ContratoGimnasio>> findAll();

    public ResponseEntity<ContratoGimnasio> create(ContratoGimnasio contratoGimnasio);

    public ResponseEntity<ContratoGimnasio> update(ContratoGimnasio contratoGimnasio);

    public ResponseEntity<Boolean> delete(Long id);
}
