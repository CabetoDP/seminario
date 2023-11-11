package com.seminario.gimnasio.responses;

import com.seminario.gimnasio.entities.Cliente;
import com.seminario.gimnasio.entities.Gimnasio;

public class ContratoGimnasioResponse {

    public long id;
    public Cliente IdCliente;
    public Gimnasio IdGimnasio;
    public int costoMensual;

    public ContratoGimnasioResponse(){

    }

    public long getId() {
        return id;
    }

    public Cliente getIdCliente() {
        return IdCliente;
    }

    public Gimnasio getIdGimnasio() {
        return IdGimnasio;
    }

    public int getCostoMensual() {
        return costoMensual;
    }
}
