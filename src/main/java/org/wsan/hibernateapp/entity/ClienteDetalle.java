package org.wsan.hibernateapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name="clientes_detalles")
public class ClienteDetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean prime;

    @Column(name="puntos_acumulados")
    private Long puntosAcumulados;

    @OneToOne
    @JoinColumn(name="cliente_detalle_id")
    private Cliente cliente;

    //constructor vacío
    public ClienteDetalle(){}
    //contructor con 2 parametros
    public ClienteDetalle(boolean prime, Long puntosAcumulados){
        this.prime = prime;
        this.puntosAcumulados = puntosAcumulados;
    }

    //Getters and Setters
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public boolean getPrime(){
        return prime;
    }

    public void setPrime(boolean prime){
        this.prime = prime;
    }

    public Long getPuntosAcumulados(){
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(Long puntosAcumulados){
        this.puntosAcumulados = puntosAcumulados;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", prime=" + prime +
                ", puntosAcumulados=" + puntosAcumulados +
                '}';
    }
}
