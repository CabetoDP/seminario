package com.seminario.gimnasio.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Entrenadores")
public class Entrenador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @OneToOne
    public Usuario IdEntrenador;
    public String Especialidad;
    public String Descripcion;

    public Entrenador(){

    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
