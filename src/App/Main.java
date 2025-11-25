package App;

import model.Direccion;
import model.Producto;
import model.Proveedor;
import repository.InventarioBD;
import util.Validador;

import java.util.ArrayList;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Se crean los arraysList de proveedores
        ArrayList<Proveedor> proveedores = new ArrayList<>();


        // se instancia la clase Direccion con 2 objetos
        var direccion1 = new Direccion("San Diego", 161, "Santiago", "RM");
        var direccion2 = new Direccion("Uno norte", 365, "Vina del Mar", "V Region");


        // pinta salto de linea por cuestion estetica
        System.out.println("\n");


        // se instancia la clase Proveedor y agrega a la lista de proveedores con 2 objetos
        var provee1 = new Proveedor(Validador.IDvalida(1, proveedores), "Ignacio SA", direccion1);
        proveedores.add(provee1);
        var provee2 = new Proveedor(Validador.IDvalida(1, proveedores), "Empresas otros SA", direccion2);
        proveedores.add(provee2);


        // pinta salto de linea por cuestion estetica
        System.out.println("\n");

        //muestra la datos de proveedor segun formato definido
        System.out.println(provee2.toString());

        //pinta salto de linea por cuestion estetica
        System.out.println("\n");


        // Se instancia constructor del inventario
        InventarioBD base = new InventarioBD("inventario.csv");
        ArrayList<Producto> inventario = base.leerInventario();


        // mostrar contenido del Fichero
        System.out.println("\n Contenido del inventario");

        for (Producto p : inventario){
            System.out.println(p.toString());
        }




        //se instancia la clase produto con 3 objetos
        var prod1 = new Producto(1, "salmon enlatado",1500,20);
        var prod2 = new Producto(2,"apando salmon",1890,100);
        var prod3 = new Producto(3,"hamburguesa salmon",1500,186);

        // se agregan los productos al inventario
        inventario.add(prod1);
        inventario.add(prod2);
        inventario.add(prod3);

        // mostrar los productos en inventario luego de las adiciones
        System.out.println("\n Inventario luego de las adiciones");

        for (Producto p : inventario){
            System.out.println(p.toString());
        }


        //pinta salto de linea por cuestion estetica
        System.out.println("\n");

        // ejecuta el guardado de cambios del inventario en fichero
        base.guardarInventario(inventario);







    }
}