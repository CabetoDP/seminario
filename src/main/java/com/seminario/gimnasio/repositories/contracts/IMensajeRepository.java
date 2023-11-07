package com.seminario.gimnasio.repositories.contracts;
import com.seminario.gimnasio.entities.Mensaje;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface IMensajeRepository extends JpaRepository<Mensaje, Long>{
    @Query(value = "SELECT * FROM Mensajes " +
                   "WHERE (id_usuario_emisor = (SELECT id FROM Usuarios WHERE Correo = :correoEmisor) " +
                   "AND id_usuario_receptor = (SELECT id FROM Usuarios WHERE Correo = :correoReceptor)) " +
                   "OR (id_usuario_emisor = (SELECT id FROM Usuarios WHERE Correo = :correoReceptor) " +
                   "AND id_usuario_receptor = (SELECT id FROM Usuarios WHERE Correo = :correoEmisor)) " +
                   "ORDER BY fecha_yhora", nativeQuery = true)
    List<Mensaje> obtenerMensajesEntreUsuarios(@Param("correoEmisor") String correoEmisor, @Param("correoReceptor") String correoReceptor);
}
