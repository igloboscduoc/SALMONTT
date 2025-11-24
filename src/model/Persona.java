package model;

public class Persona {

    private String rut;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private Direccion direccion;



    // Constructor //
    public Persona(String rut,String nombre, String apellidoPaterno, String apellidoMaterno, int edad, Direccion direccion) {
        this.rut=rut;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.direccion = direccion;
    }
    // Fin Constructor



    // Inicio metodos Getter //
    public String getRut() {
        return rut;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    public int getEdad() {
        return edad;
    }
    // Fin metodos Getter //



    // metodo para mostrar informacion //
    //@Override
    public void mostrarInformacion() {
        System.out.println(
            "Persona{" + '\n' +
            "rut = " + rut + '\n' +
            "nombre = " + nombre + '\n' +
            "apellidoPaterno = " + apellidoPaterno + '\n' +
            "apellidoMaterno = " + apellidoMaterno + "\n" +
            "edad = " + edad + "\n" +
            "direccion p= " + direccion + "\n" +
            '}');
    }
    // Fin Mostrar Informacioon //
}
