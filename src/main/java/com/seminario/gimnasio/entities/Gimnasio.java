package com.seminario.gimnasio.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Gimnasios")
public class Gimnasio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String Nombre;
    private String Horarios;
    private int CostoMensual;
    private long NIT;
    private float UbicacionX;
    private float UbicacionY;

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

    public float getUbicacionX() {
        return UbicacionX;
    }

    public void setUbicacionX(float ubicacionX) {
        UbicacionX = ubicacionX;
    }

    public float getUbicacionY() {
        return UbicacionY;
    }

    public void setUbicacionY(float ubicacionY) {
        UbicacionY = ubicacionY;
    }
}
