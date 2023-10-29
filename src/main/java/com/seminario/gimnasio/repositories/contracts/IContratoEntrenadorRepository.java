package com.seminario.gimnasio.repositories.contracts;
import com.seminario.gimnasio.entities.ContratoEntrenador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContratoEntrenadorRepository extends JpaRepository<ContratoEntrenador, Long>{
    
}