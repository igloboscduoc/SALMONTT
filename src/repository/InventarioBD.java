package repository;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import model.Producto;


public class InventarioBD {

    private String ficheroInventario;

    /**
     * Constructor para disparar clase
     * @param ficheroInventario
     */
    public InventarioBD(String ficheroInventario){
        this.ficheroInventario = ficheroInventario;
    };


    /**
     * Metodo para leer fichero con el inventario
     * @return ArrayList con Productos almacenados en el fichero
     */
    public ArrayList<Producto> leerInventario(){

        ArrayList<Producto> inventario = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ficheroInventario))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                Producto producto = new Producto( Integer.parseInt(partes[0]), partes[1], Integer.parseInt(partes[2]), Integer.parseInt(partes[3]));
                inventario.add(producto);
            }
        } catch (Exception e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
        return inventario;

    }
    // Fin metodo para leer fichero de inventario


    /**
     * Metodo para escribir en fichero que almacena inventario
     * @param inventario
     */
    public void guardarInventario(ArrayList<Producto> inventario){
        try{
            FileWriter fichero = new FileWriter(ficheroInventario);

            for (Producto p: inventario)   {
                fichero.write(p.toString()+"\n");
            }
            fichero.close();
            System.out.println("Archivo Inventario " + ficheroInventario + " guardado correctamente");

            File patharchivo = new File(ficheroInventario);
            System.out.println("Ruta del archivo: " + patharchivo.getAbsolutePath());

        }catch (IOException e){
            System.out.println("error al momento de exportar el Archivo"+ e.getMessage());
        }
    }
    // Fin del metodo para guardar inventario

}
