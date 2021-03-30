package com.starswars.starswars.dtos.mappers;

import com.starswars.starswars.dtos.PersonajeDto;
import com.starswars.starswars.entities.Personaje;

public class PersonajeDtoMapper
{
    public static PersonajeDto mapToDto(Personaje p)
    {
        return new PersonajeDto(p.getName());
    }
}
