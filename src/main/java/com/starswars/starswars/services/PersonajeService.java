package com.starswars.starswars.services;

import com.starswars.starswars.entities.Personaje;

import java.util.ArrayList;

public interface PersonajeService
{
    ArrayList<Personaje> getPersonajesByName(String nombre);
}
