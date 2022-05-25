package archivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Ayuda {

	public static void main(String[] args) {
		crearFile();
	    lectura();
	}

	public static void crearFile() {

		File directorio = new File("src/carpeta");  
		File archivo = new File("src/carpeta/texto.txt");  

		if (!directorio.exists()) {
			if (directorio.mkdirs()) {
				System.out.println("Directorio creado");
				try {
					archivo.createNewFile();
					FileWriter fileW = new FileWriter(archivo);
					BufferedWriter bufferedWriter = new BufferedWriter(fileW);

					bufferedWriter.write("texto 1");
					bufferedWriter.write("texto 2");
					bufferedWriter.newLine();

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

	public static void lectura() { 
		try {
			File archivo = new File("src/carpeta/fichero.txt");
			if (archivo.exists()) {
				FileReader fr = new FileReader(archivo);
				BufferedReader br = new BufferedReader(fr);
				String data = br.readLine();
				while (data != null) {
					System.out.println(data);  	 
					data = br.readLine();
				}
				br.close(); 
			} else {
				System.out.println("El fichero ingresado no existe");
			}

		} catch (Exception e) {
			System.out.println("Excepcion leyendo fichero : " + e);
		}

	}

}
