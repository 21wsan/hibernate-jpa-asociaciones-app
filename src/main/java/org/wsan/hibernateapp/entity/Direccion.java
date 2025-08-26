package org.wsan.hibernateapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name="direcciones")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //estos son atributos
    private Long id;

    private String calle;
    private Integer numero;

    //contructor vacío
    public Direccion(){}

    //contructor con 2 parametros
    public Direccion(String calle, Integer numero){
        this.calle = calle;
        this.numero = numero;
    }

    //Getter and Setter
    public  Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getCalle(){
        return calle;
    }

    public void setCalle(String calle){
        this.calle = calle;
    }

    public Integer getNumero(){
        return numero;
    }

    public void setNumero(Integer numero){
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", calle='" + calle + '\'' +
                ", numero=" + numero +
                '}';
    }
}
