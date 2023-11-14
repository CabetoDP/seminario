package com.seminario.gimnasio.requests;

public class ClienteRequest {
    public long id, idUsuario;
    public float altura;
    public float peso;

    public ClienteRequest (){
        
    }
    
    public long getId() {
        return id;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }
}
