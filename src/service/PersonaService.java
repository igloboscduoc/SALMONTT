package service;

import model.Proveedor;
import repository.PersonaRepositorio;
import util.Validador;

public class PersonaService {

    private final PersonaRepositorio repositorio;

    public PersonaService(PersonaRepositorio repositorio){
        this.repositorio = repositorio;
    }

    public void guardarPersona (Proveedor proveedor){
        int tempEdad = proveedor.getEdad();  // rescatamos edad de la persona
        //System.out.println("Edad: " + tempEdad);
        if (!Validador.esEdadValida(tempEdad)){
            throw new IllegalArgumentException("Edad no valida");
        }
        repositorio.guardar(proveedor);
    }
}
