package repository;

import model.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaRepositorio {

    private final List<Persona> bd = new ArrayList<>();

    public void guardar (Persona persona){
        bd.add(persona);
    }

    public List<Persona> listar(){
        return List.copyOf(bd);
    }


}
