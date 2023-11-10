package com.seminario.gimnasio.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Gimnasios")
public class Gimnasio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String Nombre;
    public String Horarios;
    public int CostoMensual;
    public long NIT;
    public String Ciudad;
    public String barrio;
    public String direccion;

    public Gimnasio(){

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getHorarios() {
        return Horarios;
    }

    public void setHorarios(String horarios) {
        Horarios = horarios;
    }

    public int getCostoMensual() {
        return CostoMensual;
    }

    public void setCostoMensual(int costoMensual) {
        CostoMensual = costoMensual;
    }

    public long getNIT() {
        return NIT;
    }

    public void setNIT(long nIT) {
        NIT = nIT;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
