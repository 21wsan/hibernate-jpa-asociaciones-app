package org.wsan.hibernateapp.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="alumnos")//este es el nombre que llevara la tabla en la DB
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Atributos que seran usados para crear la tabla en la DB
    private String nombre;
    private String apellido;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Curso> cursos;

    //contructor vacío que inicializa una nueva instancia de la clase Alumno
    public Alumno(){
        this.cursos = new ArrayList<>();
    }

    //contructor con 2 parametros
    public Alumno(String nombre, String apellido){
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //getter and setters
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cursos=" + cursos +
                '}';
    }
}
