package com.seminario.gimnasio.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "AdministracionGimnasios")
public class AdministracionGimnasio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @ManyToOne
    @JoinColumn (name = "IdAdministrador")
    public Administrador IdAdministrador;
    @ManyToOne
    @JoinColumn (name = "IdGimnasio")
    public Gimnasio IdGimnasio;

    public AdministracionGimnasio(){

    }
}
