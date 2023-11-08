package com.seminario.gimnasio.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "ContratosGimnasios")
public class ContratoGimnasio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @ManyToOne
    @JoinColumn (name = "IdCliente")
    public Usuario IdCliente;
    @ManyToOne
    @JoinColumn (name = "IdGimnasio")
    public Gimnasio IdGimnasio;

    public ContratoGimnasio(){

    }
}
