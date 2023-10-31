package com.seminario.gimnasio.repositories.contracts;
import com.seminario.gimnasio.entities.Usuario;
import com.seminario.gimnasio.requests.LoginRequest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long>{
    @Query(value = "select * from usuarios " +
                    "where correo = :login.correo and contraseña = :login.contraseña"
                    , nativeQuery = true)
    public Usuario encontrarUsuario(@Param("login") LoginRequest login);
}
