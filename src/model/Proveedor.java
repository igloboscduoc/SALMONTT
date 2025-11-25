package model;

/**
 * Representa un proveedor indicando id, nombre y direccion
 */

public class Proveedor {

    private int id;
    private String nombre;
    private Direccion direccion;


    // Inicio Constructor //
    /**
     * Constructor que inica los datos de un Proveedor
     * @param id
     * @param nombre
     * @param direccion
     */
    public Proveedor(int id, String nombre, Direccion direccion) {
        this.id= id;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    // Fin Constructor //



    // Inicio metodos Getter //
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    // Fin metodos Getter //



    // metodo para mostrar informacion //

    /**
     * Configuracion formato de salida
     * @return detalle del proveedor como String
     */
    @Override
    public String toString() {
        return (
            "Proveedor{" + '\n' +
            "Id = " + id + '\n' +
            "Nombre = " + nombre + '\n' +
            "direccion p= " + direccion + "\n" +
            '}');
    }
    // Fin Mostrar Informacioon //
}
