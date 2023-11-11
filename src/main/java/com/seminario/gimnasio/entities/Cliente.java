package com.seminario.gimnasio.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @OneToOne
    public Usuario idUsuario;
    public float altura;
    public float peso;

    public Cliente(){

    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public float getAltura() {
        return altura;
    }
    
    public void setAltura(float Altura) {
        altura = Altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float Peso) {
        peso = Peso;
    }
}
