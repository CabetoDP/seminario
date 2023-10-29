package com.seminario.gimnasio.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "ContratosGimnasios")
public class ContratoGimnasio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn (name = "IdCliente")
    private Cliente IdCliente;
    @ManyToOne
    @JoinColumn (name = "IdGimnasio")
    private Gimnasio IdGimnasio;

    public ContratoGimnasio(){

    }
}
