package com.seminario.gimnasio.responses;

public class EntrenadorResponse {

    public long id;
    public String especialidad;
    public String descripcion;
    public int costoMensual;

    

    public EntrenadorResponse(long id, String especialidad, String descripcion, int costoMensual) {
        this.id = id;
        this.especialidad = especialidad;
        this.descripcion = descripcion;
        this.costoMensual = costoMensual;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(int costoMensual) {
        this.costoMensual = costoMensual;
    }
}
