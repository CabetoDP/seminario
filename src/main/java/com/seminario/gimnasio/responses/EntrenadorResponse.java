package com.seminario.gimnasio.responses;

public class EntrenadorResponse {

    public long id;
    public String Especialidad;
    public String Descripcion;
    public int costoMensual;

    public EntrenadorResponse(){

    }

    public long getId() {
        return id;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public int getCostoMensual() {
        return costoMensual;
    }
}
