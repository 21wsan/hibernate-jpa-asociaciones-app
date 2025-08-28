package org.wsan.hibernateapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name="cursos")//este es el nombre que llevara la tabla en la DB
public class Curso {

    @Id//se usa para marcar un campo como clave primaria en la DB
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*indica que la DB asignara un valor unico incremental o autoincremental
    cuando se inserta un nuevo registro.
     la combinación de ambas anotaciones le dice a JPA: "Este campo (id) es la clave primaria de mi entidad,
     y la base de datos se encargará de asignarle un valor único y automático cada vez que guarde un nuevo objeto.
    */
    //estos son atributos, que seran usados para crear la tabla en la DB
    private Long id;
    private String titulo;
    private String profesor;

    //contructor vacío
    public Curso(){}

    //constructor con 2 parametros
    public Curso(String titulo, String profesor){
        this.titulo = titulo;
        this.profesor = profesor;
    }

    // getter and setters

    public Long getId(){
        return id;
    }

    public void getId(Long id){
        this.id = id;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getProfesor(){
        return profesor;
    }

    public void setProfesor(String profesor){
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", profesor='" + profesor + '\'' +
                '}';
    }
}
