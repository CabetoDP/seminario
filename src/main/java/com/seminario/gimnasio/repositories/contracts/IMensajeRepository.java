package com.seminario.gimnasio.repositories.contracts;
import com.seminario.gimnasio.entities.Mensaje;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface IMensajeRepository extends JpaRepository<Mensaje, Long>{
    @Query(value = " SELECT m.* FROM Mensajes m INNER JOIN Usuarios u1 ON m.id_usuario_emisor = u1.id INNER JOIN Usuarios u2 ON m.id_usuario_receptor = u2.id WHERE (u1.correo = :correoLogeado AND u1.contraseña = :contraseñaLogeado) AND (u2.id = :id OR u1.id = :id OR m.id_usuario_receptor = :id) ORDER BY m.fecha_yhora", nativeQuery = true)
    List<Mensaje> chatEntreUsuarios(@Param("correoLogeado") String correoLogeado, @Param("contraseñaLogeado") String contraseñaLogeado, @Param("id") long id);
}
