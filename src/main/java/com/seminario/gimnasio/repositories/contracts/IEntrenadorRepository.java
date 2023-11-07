package com.seminario.gimnasio.repositories.contracts;
import com.seminario.gimnasio.entities.Entrenador;
import com.seminario.gimnasio.responses.EntrenadorResponse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface IEntrenadorRepository extends JpaRepository<Entrenador, Long>{

    @Query(value = "SELECT * FROM Usuarios INNER JOIN Entrenadores ON Usuarios.id = Entrenadores.id_usuario_id WHERE Usuarios.correo = :correo AND Usuarios.contraseña = :contraseña", nativeQuery = true)
    public Entrenador mostrar(@Param("correo") String correo, @Param("contraseña") String contraseña);

    @Query(value = "SELECT id, especialidad, descripcion FROM Usuarios INNER JOIN Entrenadores ON Usuarios.id = Entrenadores.id_usuario_id WHERE Usuarios.id = id", nativeQuery = true)
    public EntrenadorResponse mostrarPerfil(@Param("id") long id);
}