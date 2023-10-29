package com.seminario.gimnasio.repositories.contracts;
import com.seminario.gimnasio.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<Cliente, Long>{
    
}
