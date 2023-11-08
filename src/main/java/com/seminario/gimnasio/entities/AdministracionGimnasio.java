package com.seminario.gimnasio.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "AdministracionGimnasios")
public class AdministracionGimnasio {

    @Id
    public long id;
    @OneToOne
    @JoinColumn (name = "IdAdministrador")
    public Usuario IdAdministrador;
    @ManyToOne
    @JoinColumn (name = "IdGimnasio")
    public Gimnasio IdGimnasio;

    public AdministracionGimnasio(){

    }
}
