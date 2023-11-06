package com.seminario.gimnasio.responses;

public class GimnasioResponse {

    public long id;
    public String Nombre;
    public String Horarios;
    public int CostoMensual;
    public long NIT;
    public float UbicacionX;
    public float UbicacionY;

    public GimnasioResponse(){

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
