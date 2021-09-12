package com.sofkau.crudPerson.repositorio;

import com.sofkau.crudPerson.entidades.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InterfaceRepositorioPersona extends CrudRepository<Persona, Integer> {

    Optional<Persona> findAllById(int id);
}
