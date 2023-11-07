package com.seminario.gimnasio.responses;

public class GimnasioResponse {

    public long id;
    public String Nombre;
    public String Horarios;
    public int CostoMensual;
    public float UbicacionX;
    public float UbicacionY;

    public GimnasioResponse(){

    }

    public String getNombre() {
        return Nombre;
    }

    public String getHorarios() {
        return Horarios;
    }

    public int getCostoMensual() {
        return CostoMensual;
    }

    public float getUbicacionX() {
        return UbicacionX;
    }

    public float getUbicacionY() {
        return UbicacionY;
    }
}
