package com.seminario.gimnasio.entities;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table (name = "Usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String tipoUsuario;
    public String nombres;
    public String apellidos;
    public long cedula;
    public String correo;
    public String contraseña;
    public long celular;
    public LocalDate fechaDeNacimiento;

    public Usuario(){

    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String TipoUsuario) {
        tipoUsuario = TipoUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String Nombres) {
        nombres = Nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String Apellidos) {
        apellidos = Apellidos;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long Cedula) {
        cedula = Cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String Correo) {
        correo = Correo;
    }
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String Contraseña) {
        contraseña = Contraseña;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long Celular) {
        celular = Celular;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

}
