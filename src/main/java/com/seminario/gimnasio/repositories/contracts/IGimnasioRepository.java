package com.seminario.gimnasio.repositories.contracts;
import com.seminario.gimnasio.entities.Gimnasio;
import com.seminario.gimnasio.responses.GimnasioResponse;
import com.seminario.gimnasio.responses.UsuarioResponse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface IGimnasioRepository extends JpaRepository<Gimnasio, Long>{

    @Query(value = "SELECT * FROM Gimnasios WHERE id = :id", nativeQuery = true)
    public Gimnasio mostrar(@Param("id") long id);

    @Query(value = "SELECT id, costo_mensual, horarios, nombre, ubicacionx, ubicaciony FROM Gimnasios WHERE id = :id", nativeQuery = true)
    public Gimnasio mostrarPerfil(@Param("id") long id);
    
    @Query(value = "SELECT id, costo_mensual, horarios, nombre, ubicacionx, ubicaciony FROM Gimnasios", nativeQuery = true)
    GimnasioResponse listar();

    @Query(value = "SELECT id, costo_mensual, horarios, nombre, ubicacionx, ubicaciony FROM Gimnasios " +
                   "WHERE nombre LIKE %:busqueda% LIMIT 1", nativeQuery = true)
    UsuarioResponse buscar(@Param("busqueda") String busqueda);

}