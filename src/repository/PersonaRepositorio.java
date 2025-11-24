package repository;

import model.Proveedor;

import java.util.ArrayList;
import java.util.List;

public class PersonaRepositorio {

    private final List<Proveedor> bd = new ArrayList<>();

    public void guardar (Proveedor proveedor){
        bd.add(proveedor);
    }

    public List<Proveedor> listar(){
        return List.copyOf(bd);
    }


}
