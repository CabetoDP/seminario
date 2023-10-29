package com.seminario.gimnasio.repositories.contracts;
import com.seminario.gimnasio.entities.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdministradorRepository extends JpaRepository<Administrador, Long>{
    
}
