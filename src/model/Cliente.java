package model;

public class Cliente {

    private int id;
    private String nombre;
    private Direccion direccion;



    // Constructor //
    public Cliente(int id, String nombre, Direccion direccion) {
        this.id= id;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    // Fin Constructor



    // Inicio metodos Getter //
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    // Fin metodos Getter //



    // metodo para mostrar informacion //
    //@Override
    public void mostrarInformacion() {
        System.out.println(
            "Proveedor{" + '\n' +
            "Id = " + id + '\n' +
            "direccion p= " + direccion + "\n" +
            '}');
    }
    // Fin Mostrar Informacioon //
}
