package com.seminario.gimnasio.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Gimnasios")
public class Gimnasio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String nombre;
    public String horarios;
    public int costoMensual;
    public long NIT;
    public String ciudad;
    public String barrio;
    public String direccion;

    public Gimnasio(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        nombre = Nombre;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String Horarios) {
        horarios = Horarios;
    }

    public int getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(int CostoMensual) {
        costoMensual = CostoMensual;
    }

    public long getNIT() {
        return NIT;
    }

    public void setNIT(long nIT) {
        NIT = nIT;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String Ciudad) {
        ciudad = Ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String Barrio) {
        barrio = Barrio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String Direccion) {
        direccion = Direccion;
    }
}
