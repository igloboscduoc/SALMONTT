package model;

/**
 * Representa un producto indicando id, numero, precio y stock,
 * @author Ignacio Lobos
 * @version 1.0
 */

public class Producto {

    private int id;
    private String nombre;
    private double precio;
    private int stock;

    // Inicio Constructor //
    /**
     * Constructor que inicia los datos de un producto,
     * @param id
     * @param nombre
     * @param precio
     * @param stock
     */
    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    // Fin Constructor //



    // Inicio metodos Getter  //
    public double getPrecio() {
        return precio;
    }
    // Fin metodos Getter //



    // Inicio toString //

    /**
     * Configuracion formato de salida
     * @return detalle de producto como String
     */
    @Override
    public String toString() {
        return "Producto: " + id + " - " + nombre + ", precio: " + precio + ", stock: " + stock;
    }
}
