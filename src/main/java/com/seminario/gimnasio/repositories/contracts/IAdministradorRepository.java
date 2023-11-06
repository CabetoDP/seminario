package com.seminario.gimnasio.repositories.contracts;
import com.seminario.gimnasio.entities.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface IAdministradorRepository extends JpaRepository<Administrador, Long>{
    
    @Query(value = "SELECT * FROM Usuarios INNER JOIN Administradores ON Usuarios.id = Administradores.id_usuario_id WHERE Usuarios.correo = :correo AND Usuarios.contraseña = :contraseña", nativeQuery = true)
    public Administrador mostrar(@Param("correo") String correo, @Param("contraseña") String contraseña);

    @Query(value = "SELECT descripcion, especialidad FROM Usuarios INNER JOIN Administradores ON Usuarios.id = Administradores.id_usuario_id WHERE Usuarios.correo = :correo AND Usuarios.contraseña = :contraseña", nativeQuery = true)
    public Administrador mostrarPerfil(@Param("correo") String correo, @Param("contraseña") String contraseña);

}
