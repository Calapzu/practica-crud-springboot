package com.sofkau.crudPerson.entidades;

import javax.persistence.*;

@Entity
@Table(name="persona")

public class Persona {

    @Id
    //Para generar el Id de forma automatica, le tengo que decir que tipo es y como me lo va a generar
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String edad;

    public Persona() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

}
