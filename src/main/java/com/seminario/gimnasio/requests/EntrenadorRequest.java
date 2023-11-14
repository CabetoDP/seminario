package com.seminario.gimnasio.requests;

public class EntrenadorRequest {
    public long id, idUsuario;
    public String especialidad;
    public String descripcion;
    public int costoMensual;

    public int getCostoMensual() {
        return costoMensual;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public long getId() {
        return id;
    }

    public long getIdUsuario() {
        return idUsuario;
    }
}
