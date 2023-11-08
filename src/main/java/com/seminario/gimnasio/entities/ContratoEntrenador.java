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
    public Usuario IdCliente;
    @ManyToOne
    @JoinColumn (name = "IdEntrenador")
    public Usuario IdEntrenador;

    public ContratoEntrenador(){

    }
}
