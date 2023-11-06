package com.seminario.gimnasio.repositories.contracts;
import com.seminario.gimnasio.entities.ContratoGimnasio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface IContratoGimnasioRepository extends JpaRepository<ContratoGimnasio, Long>{
    
}
