package com.seminario.gimnasio.responses;

public class EntrenadorResponse {

    public String Especialidad;
    public String Descripcion;

    public EntrenadorResponse(){

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
