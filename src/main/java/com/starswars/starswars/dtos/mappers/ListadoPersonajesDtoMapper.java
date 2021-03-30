package com.starswars.starswars.dtos.mappers;

import com.starswars.starswars.dtos.ListadoPersonajesDto;
import com.starswars.starswars.dtos.PersonajeDto;
import com.starswars.starswars.entities.Personaje;

import java.util.ArrayList;

public class ListadoPersonajesDtoMapper
{
    public static ListadoPersonajesDto mapToDto(ArrayList<Personaje> personajes)
    {
        ArrayList<PersonajeDto> pers = new ArrayList<>();

        for (Personaje p: personajes)
            pers.add(PersonajeDtoMapper.mapToDto(p));

        return new ListadoPersonajesDto(pers);
    }
}
