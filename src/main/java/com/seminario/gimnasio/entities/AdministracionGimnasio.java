package com.seminario.gimnasio.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "AdministracionGimnasios")
public class AdministracionGimnasio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn (name = "IdAdministrador")
    private Administrador IdAdministrador;
    @ManyToOne
    @JoinColumn (name = "IdGimnasio")
    private Gimnasio IdGimnasio;

    public AdministracionGimnasio(){

    }
}
