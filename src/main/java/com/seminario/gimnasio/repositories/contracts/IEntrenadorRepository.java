package com.seminario.gimnasio.repositories.contracts;
import com.seminario.gimnasio.entities.Entrenador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEntrenadorRepository extends JpaRepository<Entrenador, Long>{
    
}