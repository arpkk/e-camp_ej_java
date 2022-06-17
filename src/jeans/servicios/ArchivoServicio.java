package jeans.servicios;

import jeans.utilidades.Utilidades;

import java.io.File;
import java.util.Scanner;

public class ArchivoServicio {
    public void cargarDatos(String directorio) throws Exception {
        Scanner sc = new Scanner(new File(directorio));
        int count = 0;
        ProductoServicio agregarProducto = new ProductoServicio();
        sc.useDelimiter(",");
        String articulo = null;
        String precio = null;
        String descripcion = null;
        String codigo = null;
        String talla = null;
        String color = null;
        String marca = null;
        while (sc.hasNextLine()) {
            articulo = sc.next();
            precio = sc.next();
            descripcion = sc.next();
            codigo = sc.next();
            talla = sc.next();
            marca= sc.next();
            color = sc.nextLine();
            agregarProducto.agregarProductos(articulo, precio, descripcion, codigo, talla, marca, color);
        }
        sc.close();
        Utilidades.stopAndContinue();
    }
}
