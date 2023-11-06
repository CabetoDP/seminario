package com.seminario.gimnasio.repositories.contracts;
import com.seminario.gimnasio.entities.Mensaje;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface IMensajeRepository extends JpaRepository<Mensaje, Long>{
    @Query(value = "SELECT * FROM Mensajes " +
                   "WHERE (IdUsuarioEmisor = (SELECT id FROM Usuarios WHERE Correo = :correoEmisor) " +
                   "AND IdUsuarioReceptor = (SELECT id FROM Usuarios WHERE Correo = :correoReceptor)) " +
                   "OR (IdUsuarioEmisor = (SELECT id FROM Usuarios WHERE Correo = :correoReceptor) " +
                   "AND IdUsuarioReceptor = (SELECT id FROM Usuarios WHERE Correo = :correoEmisor)) " +
                   "ORDER BY fechaYhora", nativeQuery = true)
    List<Mensaje> obtenerMensajesEntreUsuarios(@Param("correoEmisor") String correoEmisor, @Param("correoReceptor") String correoReceptor);
}
