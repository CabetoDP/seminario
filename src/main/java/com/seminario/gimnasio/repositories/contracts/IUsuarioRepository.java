package com.seminario.gimnasio.repositories.contracts;
import com.seminario.gimnasio.entities.Usuario;
//import com.seminario.gimnasio.requests.LoginRequest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface IUsuarioRepository extends JpaRepository<Usuario, Long>{
    @Query(value = "SELECT * FROM Usuarios WHERE correo = :correo AND contraseña = :contraseña", nativeQuery = true)
    public Usuario encontrarUsuario(@Param("correo") String correo, @Param("contraseña") String contraseña);
}