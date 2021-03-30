package com.starswars.starswars.repositories;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.starswars.starswars.entities.Personaje;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.ArrayList;

@Repository
public class PersonajeRepositoryImple implements PersonajeRepository
{
    @Override
    public ArrayList<Personaje> getPersonajes()
    {
        ArrayList<Personaje> personajes = new ArrayList<>();

        personajes = loadDataBase();

        return personajes;
    }

    private ArrayList<Personaje> loadDataBase()
    {
        File file;
        ArrayList<Personaje> personajes = null;

        try
        {
            file = ResourceUtils.getFile("classpath:starwars.json");
            ObjectMapper objectMapper = new ObjectMapper();
            com.fasterxml.jackson.core.type.TypeReference<ArrayList<Personaje>> typeReference = new com.fasterxml.jackson.core.type.TypeReference<>() {};

            personajes = objectMapper.readValue(file, typeReference);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return personajes;
    }
}