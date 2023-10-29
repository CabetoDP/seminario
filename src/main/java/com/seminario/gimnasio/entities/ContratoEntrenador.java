package com.seminario.gimnasio.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "ContratosEntrenadores")
public class ContratoEntrenador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn (name = "IdCliente")
    private Usuario IdCliente;
    @ManyToOne
    @JoinColumn (name = "IdEntrenador")
    private Entrenador IdEntrenador;

    public ContratoEntrenador(){

    }
}
