package archivo;

import java.io.*;
import java.util.ArrayList;

public class Archivo {

    public static void crearFile(String directorio, String fichero) {

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Perro");
        lista.add("Gato");
        lista.add("Juan");
        lista.add("Daniel");
        lista.add("Juan");
        lista.add("Gato");
        lista.add("Perro");
        lista.add("Camila");
        lista.add("Daniel");
        lista.add("Camila");

        File direc = new File(directorio);
        File archivo = new File(fichero);

        if (!direc.exists()) {
            if (direc.mkdirs()) {
                System.out.println("Directorio creado");
                try {
                    archivo.createNewFile();
                    FileWriter fileW = new FileWriter(archivo);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileW);

                    for (String x : lista) {
                        bufferedWriter.write(x);
                        bufferedWriter.newLine();
                    }

                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Error al crear directorio");
            }
        } else {
            System.out.println("Directorio ya esta creado");

        }
    }


    public static void buscarTexto(String nombreFichero, String texto) {
        int count = 0;
        try {
            File archivo = new File(nombreFichero);
            if (archivo.exists()) {
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                String data = br.readLine();
                while (data != null) {
                    if (data.equals(texto))
                        count++;
                    data = br.readLine();
                }
                System.out.println("cantidad de repeticiones del texto -> " + count);
                br.close();
            } else {
                System.out.println("El fichero ingresado no existe");
            }

        } catch (Exception e) {
            System.out.println("Excepcion leyendo fichero : " + e);
        }
    }
}
