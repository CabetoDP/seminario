package com.seminario.gimnasio.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "ContratosEntrenadores")
public class ContratoEntrenador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @ManyToOne
    @JoinColumn (name = "IdCliente")
    public Usuario idCliente;
    @ManyToOne
    @JoinColumn (name = "IdEntrenador")
    public Usuario idEntrenador;
    public String tYc;
    public int costoMensual;

    public ContratoEntrenador(){

    }

    public Usuario getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Usuario IdCliente) {
        idCliente = IdCliente;
    }

    public Usuario getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(Usuario IdEntrenador) {
        idEntrenador = IdEntrenador;
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
