package com.seminario.gimnasio.responses;

import java.time.LocalDate;

public class UsuarioResponse {
    private long id;
    private String tipo_usuario;
    private String nombres;
    private String apellidos;
    private long celular;
    private LocalDate fecha_de_nacimiento;

    public UsuarioResponse(Long id, String tipo_usuario, String nombres, String apellidos, long celular, LocalDate fecha_de_nacimiento) {
        this.id = id;
        this.tipo_usuario = tipo_usuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.celular = celular;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public LocalDate getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(LocalDate fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
   
}