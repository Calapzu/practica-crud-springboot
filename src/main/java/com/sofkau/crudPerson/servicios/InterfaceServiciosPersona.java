package com.sofkau.crudPerson.servicios;

import com.sofkau.crudPerson.entidades.Persona;

import java.util.List;
import java.util.Optional;

public interface InterfaceServiciosPersona {

    public List<Persona> listar();
    //public Persona listarId(int id);
    public Optional<Persona> listarId(int id);
    public Persona guardar(Persona persona);
    public void borrar(int id);
    public Persona actualizar(Persona persona);
}
