package com.seminario.gimnasio.repositories.contracts;
import com.seminario.gimnasio.entities.Gimnasio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGimnasioRepository extends JpaRepository<Gimnasio, Long>{
    
}