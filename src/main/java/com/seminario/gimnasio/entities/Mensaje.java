package com.seminario.gimnasio.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Mensajes")
public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn (name = "IdUsuarioEmisor")
    private Usuario idEmisor;
    @ManyToOne
    @JoinColumn (name = "IdUsuarioReceptor")
    private Usuario idReceptor;
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
