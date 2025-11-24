package service;

import model.Persona;
import repository.PersonaRepositorio;
import util.Validador;

public class PersonaService {

    private final PersonaRepositorio repositorio;

    public PersonaService(PersonaRepositorio repositorio){
        this.repositorio = repositorio;
    }

    public void guardarPersona (Persona persona){
        int tempEdad = persona.getEdad();  // rescatamos edad de la persona
        //System.out.println("Edad: " + tempEdad);
        if (!Validador.esEdadValida(tempEdad)){
            throw new IllegalArgumentException("Edad no valida");
        }
        repositorio.guardar(persona);
    }
}
