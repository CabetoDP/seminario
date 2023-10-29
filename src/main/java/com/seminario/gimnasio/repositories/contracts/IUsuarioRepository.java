package com.seminario.gimnasio.repositories.contracts;
import com.seminario.gimnasio.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
