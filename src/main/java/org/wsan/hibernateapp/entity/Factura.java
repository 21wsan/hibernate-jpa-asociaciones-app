package org.wsan.hibernateapp.entity;

import jakarta.persistence.*;

import java.util.Objects;

/*
(JPA: Jakarta Persistence API)
@Entity,@Table
estas anotaciones se usan para mapear clases de Java a tablas de una base de datos.
 */
@Entity //indica que la clase factura es una entidad que representa una tabla en DB.
@Table(name="facturas")//proporciona detalles de mapeo adicionales, especifica el nombre de la tabla en DB.
public class Factura {
    @Id//marca un campo como clave primaria (Primary Key)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        le indica a hibernate que no proporcione un valor para id al insertar un nuevo producto,
         debe esperar que la DB genera y asigne el valor de forma automatica.
     */
    private Long id;
    private String descripcion;
    private Long total;

    @ManyToOne(fetch = FetchType.LAZY)//muchas facturas un cliente
    @JoinColumn(name="id_cliente")//se indica de forma manual el nombre de la llave foranea
    private Cliente cliente;

    //constructor vacío
    public Factura(){}
    //contructor con 2 parametros (descripcion, total)
    public Factura(String descripcion, Long total){
        this.descripcion = descripcion;
        this.total = total;
    }

    //getter and Setters
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public Long getTotal(){
        return total;
    }

    public void setTotal(Long total){
        this.total = total;
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
                ", descripcion='" + descripcion + '\'' +
                ", total=" + total +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Factura factura = (Factura) o;
        return Objects.equals(id, factura.id) && Objects.equals(descripcion, factura.descripcion) && Objects.equals(total, factura.total);
    }
}
