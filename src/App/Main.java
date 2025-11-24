package App;

import model.Direccion;
import model.Producto;
import model.Proveedor;
import repository.PersonaRepositorio;
import service.PersonaService;

import java.util.ArrayList;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var repositorio = new PersonaRepositorio();
        var service = new PersonaService(repositorio);

        ArrayList<Producto> inventario = new ArrayList<>();
        Producto> inventario = new ArrayList<>();



        var direccion1 = new Direccion("San Diego", 161, "Santiago", "RM");

        var persona1 = new Proveedor(01 , "Ignacio SA", direccion1);



        System.out.println("\n");

        service.guardarPersona(persona1);

        repositorio.listar().forEach(proveedor -> {
            proveedor.mostrarInformacion();
        });


        System.out.println("\n");



    }
}