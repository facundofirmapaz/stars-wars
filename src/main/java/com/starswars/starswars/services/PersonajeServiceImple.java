package com.starswars.starswars.services;

import com.starswars.starswars.entities.Personaje;
import com.starswars.starswars.repositories.PersonajeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class PersonajeServiceImple implements PersonajeService
{
    private final PersonajeRepository personajeRepository;

    public PersonajeServiceImple(PersonajeRepository personajeRepository)
    {
        this.personajeRepository = personajeRepository;
    }

    @Override
    public ArrayList<Personaje> getPersonajesByName(String nombre)
    {
        ArrayList<Personaje> personajes = personajeRepository.getPersonajes();

        return (ArrayList<Personaje>) personajes.stream().filter(p -> p.getName().contains(nombre)).collect(Collectors.toList());
    }
}
