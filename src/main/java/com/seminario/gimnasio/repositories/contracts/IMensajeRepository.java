package com.seminario.gimnasio.repositories.contracts;
import com.seminario.gimnasio.entities.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMensajeRepository extends JpaRepository<Mensaje, Long>{
    
}
