package com.seminario.gimnasio.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Entrenadores")
public class Entrenador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @OneToOne
    public Usuario idUsuario;
    public String especialidad;
    public String descripcion;
    public int costoMensual;

    public Entrenador(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        especialidad = Especialidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        descripcion = Descripcion;
    }

    public int getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(int CostoMensual) {
        costoMensual = CostoMensual;
    }
}
