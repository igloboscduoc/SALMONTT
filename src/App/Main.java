package App;

import model.Direccion;
import model.Persona;
import repository.PersonaRepositorio;
import service.PersonaService;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var repositorio = new PersonaRepositorio();
        var service = new PersonaService(repositorio);


        var direccion1 = new Direccion("San Diego", 161, "Santiago", "RM");

        var persona1 = new Persona("19375974-2", "Ignacio", "Lobos", "Chacon",29, direccion1);



        System.out.println("\n");

        service.guardarPersona(persona1);

        repositorio.listar().forEach( persona-> {
            persona.mostrarInformacion();
        });


        System.out.println("\n");


    }
}