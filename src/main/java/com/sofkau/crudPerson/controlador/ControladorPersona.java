package com.sofkau.crudPerson.controlador;

import com.sofkau.crudPerson.entidades.Persona;
import com.sofkau.crudPerson.servicios.InterfaceServiciosPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

//@RestController es la que indica que esta clse controlador va a tener los metodos de acceso POST,GET,PUT,DELETE
@RestController
@RequestMapping("api")
public class ControladorPersona {

    @Autowired
    private InterfaceServiciosPersona servicio;

    @GetMapping(value = "/listarPersonas")
    public Iterable<Persona> listarPersonas() {
        return servicio.listar();
    }

    @GetMapping(value = "/listarPersonasId/{id}")
    public Optional<Persona> listaPersonasPorId(@PathVariable("id") int id) {
        return servicio.listarId(id);
    }

    @PostMapping(value = "/guardarPersonas")
    public Persona guardarPersona(@RequestBody Persona persona) {
        return servicio.guardar(persona);
    }

    @DeleteMapping(value = "/eliminarPersonaId/{id}")
    public void borrarPorId(@PathVariable("id") int id) {
        servicio.borrar(id);

    }




}
