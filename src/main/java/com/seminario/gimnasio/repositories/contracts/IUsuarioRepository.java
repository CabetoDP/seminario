package com.seminario.gimnasio.repositories.contracts;
import com.seminario.gimnasio.entities.Usuario;
import com.seminario.gimnasio.responses.UsuarioResponse;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface IUsuarioRepository extends JpaRepository<Usuario, Long>{

    @Query(value = "SELECT * FROM Usuarios WHERE correo = :correo AND contraseña = :contraseña", nativeQuery = true)
    public Usuario encontrar(@Param("correo") String correo, @Param("contraseña") String contraseña);

    @Query(value = "SELECT tipo_usuario FROM Usuarios WHERE correo = :correo AND contraseña = :contraseña", nativeQuery = true)
    public String mostrarTipo(@Param("correo") String correo, @Param("contraseña") String contraseña);

    @Query(value = "SELECT * FROM Usuarios WHERE correo = :correo AND contraseña = :contraseña", nativeQuery = true)
    public Usuario mostrar(@Param("correo") String correo, @Param("contraseña") String contraseña);

    @Query(value = "SELECT apellidos, celular, nombres, tipo_usuario, edad FROM Usuarios WHERE id = :id", nativeQuery = true)
    public UsuarioResponse mostrarPerfil(@Param("id") long id);
    
    @Query(value = "SELECT DISTINCT u.id, u.apellidos, u.celular, u.nombres, u.tipo_usuario, u.edad " +
                   "FROM Usuarios u " +
                   "JOIN Mensajes m1 ON u.id = m1.id_usuario_receptor " +
                   "WHERE m1.id_usuario_emisor = :usuarioId " +
                   "UNION " +
                   "SELECT DISTINCT u.id, u.apellidos, u.celular, u.nombres, u.tipo_usuario, u.edad " +
                   "FROM Usuarios u " +
                   "JOIN Mensajes m2 ON u.id = m2.id_usuario_emisor " +
                   "WHERE m2.id_usuario_receptor = :usuarioId ", nativeQuery = true)
    List<UsuarioResponse> listarContactos(@Param("usuarioId") long usuarioId);
    
    @Query(value = "SELECT id, apellidos, celular, nombres, tipo_usuario, edad FROM Usuarios " +
                   "WHERE CONCAT(Nombres, ' ', Apellidos) LIKE %:busqueda% LIMIT 1", nativeQuery = true)
    UsuarioResponse buscar(@Param("busqueda") String busqueda);

    @Query(value = "SELECT id, apellidos, celular, nombres, tipo_usuario, edad FROM Usuarios", nativeQuery = true)
    List <UsuarioResponse> listar();
}