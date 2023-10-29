package com.seminario.gimnasio.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @OneToOne
    public Usuario IdCliente;
    public float Altura;
    public float Peso;

    public Cliente(){

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
