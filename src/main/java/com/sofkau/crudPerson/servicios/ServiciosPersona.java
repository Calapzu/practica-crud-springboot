package com.sofkau.crudPerson.servicios;

import com.sofkau.crudPerson.entidades.Persona;
import com.sofkau.crudPerson.repositorio.InterfaceRepositorioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiciosPersona implements InterfaceServiciosPersona {

    //Se hace la instancia del repositorio para poder tener los metodos que trae CrudRepository<>
    @Autowired
    private InterfaceRepositorioPersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        return  data.findAllById(id);;
    }


    @Override
    public Persona guardar(Persona persona) {
        return data.save(persona);
    }

    @Override
    public void borrar(int id) {
        data.deleteById(id);
    }

    @Override
    public Persona actualizar(Persona persona) {
        return null;
    }

}
