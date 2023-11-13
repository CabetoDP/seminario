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
    public Usuario idCliente;
    @ManyToOne
    @JoinColumn (name = "IdGimnasio")
    public Gimnasio idGimnasio;
    public String tYc;
    public int costoMensual;

    public ContratoGimnasio(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Usuario getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Usuario IdCliente) {
        idCliente = IdCliente;
    }

    public Gimnasio getIdGimnasio() {
        return idGimnasio;
    }

    public void setIdGimnasio(Gimnasio idGimnasio) {
        this.idGimnasio = idGimnasio;
    }

    public String gettYc() {
        return tYc;
    }

    public void settYc(String tYc) {
        this.tYc = tYc;
    }

    public int getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(int costoMensual) {
        this.costoMensual = costoMensual;
    }

    
}
