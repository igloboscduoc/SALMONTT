package model;

/**
 * Representa una direcccion indicando calle, numero, ciudad y region,
 * @author Ignacio Lobos
 * @version 1.0
 */

public class Direccion {

    private String calle;
    private int numero;
    private String ciudad;
    private String region;

    //constructor//

    /**
     * constructor que inicia los datos de una direccion
     * @param calle
     * @param numero
     * @param ciudad
     * @param region
     */
    public Direccion(String calle, int numero, String ciudad, String region) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.region = region;
    }
    // Fin Constructor//


    // Inicio metodos Getter //
    public String getCalle() {
        return calle;
    }
    public int getNumero() {
        return numero;
    }
    public String getCiudad() {
        return ciudad;
    }
    public String getRegion() {
        return region;
    }
    // Fin metodos Getter


    // Inicio metodos Setter //
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    // Fin metodos Setter//


    // Inicio metodo toString//
    /**
     * Configuracion formato de salida
     * @return direccion completa como String
     */
    @Override
    public String toString() {
        return calle + " #" + numero + ", " + ciudad + ", " + region ;
    }
    // Fin metodo toString
}
