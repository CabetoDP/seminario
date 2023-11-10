package com.seminario.gimnasio.responses;

import java.time.LocalDate;

public class UsuarioResponse {
    
    public long id;
    public String TipoUsuario;
    public String Nombres;
    public String Apellidos;
    public long Celular;
    public LocalDate fechaDeNacimiento;

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

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
}