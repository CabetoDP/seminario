package com.seminario.gimnasio.responses;

public class UsuarioResponse {
    
    public long id;
    public String TipoUsuario;
    public String Nombres;
    public String Apellidos;
    public long Celular;
    public int Edad;

    public UsuarioResponse(){

    }

    public long getId() {
        return id;
    }

    public String getTipoUsuario() {
        return TipoUsuario;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public long getCelular() {
        return Celular;
    }

    public int getEdad() {
        return Edad;
    }
}