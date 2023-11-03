package com.seminario.gimnasio.responses;

public class LoginResponse {
    public String tipoUsuario;
    public Boolean validacion;

    public LoginResponse(String tipoUsuario, Boolean validacion){
        this.tipoUsuario = tipoUsuario;
        this.validacion = validacion;
    }

    public String getTipoUsuario(String tipoUsuario) {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Boolean getValidacion() {
        return validacion;
    }

    public void setValidacion(Boolean validacion) {
        this.validacion = validacion;
    }
}
