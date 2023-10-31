package com.seminario.gimnasio.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Administradores")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @OneToOne
    public Usuario IdUsuario;

    public Administrador(){

    }
}
