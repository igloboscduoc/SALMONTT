package util;

import java.util.ArrayList;
import model.Proveedor;

public class Validador {

    public Validador() {}

    public static int IDvalida(int ID, ArrayList<Proveedor> proveedores) {
        int newID = ID;
        for (Proveedor p : proveedores) {
            while (p.getId() == newID) {
                newID = newID + 1;
            }
        }
        System.out.println("El ID de proveedor : " + newID + " fue cargado correctamente");
        return newID;
    }


}
