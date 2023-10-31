package com.seminario.gimnasio.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Mensajes")
public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @ManyToOne
    @JoinColumn (name = "IdUsuarioEmisor")
    public Usuario idEmisor;
    @ManyToOne
    @JoinColumn (name = "IdUsuarioReceptor")
    public Usuario idReceptor;
    String mensaje;

    public long getId() {
        return id;
    }

    public Usuario getIdEmisor() {
        return idEmisor;
    }

    public Usuario getIdReceptor() {
        return idReceptor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
