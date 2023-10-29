package com.seminario.gimnasio.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String TipoUsuario;
    public String Nombres;
    public String Apellidos;
    public long Cedula;
    public String Correo;
    public String Contraseña;
    public long Celular;
    public int Edad;

    public Usuario(){

    }

    public String getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        TipoUsuario = tipoUsuario;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public long getCedula() {
        return Cedula;
    }

    public void setCedula(long cedula) {
        Cedula = cedula;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }
    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public long getCelular() {
        return Celular;
    }

    public void setCelular(long celular) {
        Celular = celular;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }
}
