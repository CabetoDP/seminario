package com.seminario.gimnasio.responses;

public class ClienteResponse {

    public long id_usuario_id;
    public float Altura;
    public float Peso;

    

    public ClienteResponse(long id_usuario_id, float altura, float peso) {
        this.id_usuario_id = id_usuario_id;
        Altura = altura;
        Peso = peso;
    }

    public long getId_usuario_id() {
        return id_usuario_id;
    }

    public void setId_usuario_id(long id_usuario_id) {
        this.id_usuario_id = id_usuario_id;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float altura) {
        Altura = altura;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float peso) {
        Peso = peso;
    }
}
