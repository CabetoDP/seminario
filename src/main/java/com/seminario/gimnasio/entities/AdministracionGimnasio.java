package com.seminario.gimnasio.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "AdministracionGimnasios")
public class AdministracionGimnasio {

    @Id
    public long id;
    @OneToOne
    @JoinColumn (name = "IdAdministrador")
    public Usuario idAdministrador;
    @ManyToOne
    @JoinColumn (name = "IdGimnasio")
    public Gimnasio idGimnasio;

    public AdministracionGimnasio(){

    }
}
