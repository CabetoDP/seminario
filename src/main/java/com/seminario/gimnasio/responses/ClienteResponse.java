package com.seminario.gimnasio.responses;

public class ClienteResponse {

    public float Altura;
    public float Peso;

    public ClienteResponse(){

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
