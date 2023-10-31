package com.seminario.gimnasio.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "ContratosEntrenadores")
public class ContratoEntrenador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @ManyToOne
    @JoinColumn (name = "IdCliente")
    public Cliente IdCliente;
    @ManyToOne
    @JoinColumn (name = "IdEntrenador")
    public Entrenador IdEntrenador;

    public ContratoEntrenador(){

    }
}
