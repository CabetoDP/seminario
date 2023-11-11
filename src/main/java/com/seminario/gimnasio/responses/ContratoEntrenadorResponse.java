package com.seminario.gimnasio.responses;

import com.seminario.gimnasio.entities.Cliente;
import com.seminario.gimnasio.entities.Entrenador;

public class ContratoEntrenadorResponse {

    public long id;
    public Cliente IdCliente;
    public Entrenador IdEntrenador;
    public String tYc;
    public int costoMensual;

    public ContratoEntrenadorResponse(){

    }

    public Cliente getIdCliente() {
        return IdCliente;
    }

    public Entrenador getIdEntrenador() {
        return IdEntrenador;
    }

    public int getCostoMensual() {
        return costoMensual;
    }
    
    public String gettYc() {
        return tYc;
    }
    
}
