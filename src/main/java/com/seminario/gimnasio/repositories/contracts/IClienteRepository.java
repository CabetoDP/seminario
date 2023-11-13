package com.seminario.gimnasio.repositories.contracts;
import com.seminario.gimnasio.entities.Cliente;
import com.seminario.gimnasio.responses.ClienteResponse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface IClienteRepository extends JpaRepository<Cliente, Long>{

    @Query(value = "SELECT * FROM Usuarios INNER JOIN Clientes ON Usuarios.id = Clientes.id_usuario_id WHERE Usuarios.correo = :correo AND Usuarios.contraseña = :contraseña", nativeQuery = true)
    public Cliente mostrar(@Param("correo") String correo, @Param("contraseña") String contraseña);

    @Query(value = "SELECT clientes.id_usuario_id, Clientes.altura, Clientes.peso FROM Usuarios INNER JOIN Clientes ON Usuarios.id = Clientes.id_usuario_id WHERE Usuarios.id = :id", nativeQuery = true)
    public ClienteResponse mostrarPerfil(@Param("id") long id);
}
