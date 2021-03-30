package com.starswars.starswars.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@AllArgsConstructor
@Data
public class ListadoPersonajesDto
{
    private ArrayList<PersonajeDto> personajes;
}
