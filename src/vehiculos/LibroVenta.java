package vehiculos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LibroVenta {
    private String nombreVenta;
    private String fechaVenta;

    public LibroVenta(String nombreVenta, String fechaVenta){
        this.nombreVenta= nombreVenta;
        this.fechaVenta=fechaVenta;
    }

    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public void guardarVenta(Cliente cliente, Vehiculo vehiculo){
        File direc = new File("src/Ficheros");
        File archivo = new File("src/Ficheros/"+getNombreVenta()+".txt");

        if (!direc.exists()) {
            if (direc.mkdirs()) {
                System.out.println("Directorio creado");
                try {
                    archivo.createNewFile();
                    FileWriter fileW = new FileWriter(archivo);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileW);

                    bufferedWriter.write("Patente: "+vehiculo.getPatente());
                    bufferedWriter.newLine();
                    bufferedWriter.write("Edad del cliente : "+cliente.getEdad());
                    bufferedWriter.newLine();
                    bufferedWriter.write("Fecha de venta : "+ getFechaVenta());
                    bufferedWriter.newLine();
                    bufferedWriter.write("Nombre de venta: "+ getNombreVenta());

                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Error al crear directorio");
            }
        } else {
            System.out.println("Directorio ya estaba creado");

        }
    }
}
