package com.seminario.gimnasio.repositories.contracts;
import com.seminario.gimnasio.entities.ContratoEntrenador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface IContratoEntrenadorRepository extends JpaRepository<ContratoEntrenador, Long>{
    
}