package com.starswars.starswars.controllers;

import com.starswars.starswars.dtos.ListadoPersonajesDto;
import com.starswars.starswars.dtos.mappers.ListadoPersonajesDtoMapper;
import com.starswars.starswars.entities.Personaje;
import com.starswars.starswars.services.PersonajeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/personaje")
public class PersonajeController 
{
    private final PersonajeService personajeService;

    public PersonajeController(PersonajeService personajeService)
    {
        this.personajeService = personajeService;
    }

    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<?> personajesByNombre(@PathVariable String nombre)
    {
        ArrayList<Personaje> personajes = personajeService.getPersonajesByName(nombre);

        ListadoPersonajesDto resp = ListadoPersonajesDtoMapper.mapToDto(personajes);

        return ResponseEntity.ok(resp);
    }
}
