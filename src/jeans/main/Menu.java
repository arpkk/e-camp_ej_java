package jeans.main;

import jeans.exportador.ExportadorTxt;
import jeans.servicios.ArchivoServicio;
import jeans.servicios.ProductoServicio;
import jeans.utilidades.Utilidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Menu {

    ProductoServicio productoServicio = new ProductoServicio();
    ExportadorTxt exportarTxt = new ExportadorTxt();
	ArchivoServicio importarcsv = new ArchivoServicio();
    Utilidades utilidades = new Utilidades();
    String fileName = "productos";
    Scanner scanner = new Scanner(System.in);

    public void iniciarMenu() throws Exception {
        List<String> opcionesMenu = new ArrayList<String>();
        opcionesMenu.add("Listar Producto");
        opcionesMenu.add("Agregar Producto");
        opcionesMenu.add("Exportar Datos");
        opcionesMenu.add("Importar Datos");
        opcionesMenu.add("Salir");

        Menu menu = new Menu();
        menu.seleccionOpcion(opcionesMenu);
    }

    private void seleccionOpcion(List<String> opcionesMenu) throws Exception {
        boolean continuar = false;
        int resultado;

        do {
            resultado = construirMenu(opcionesMenu);

            switch (resultado) {
                case 1:
                    listarProductos();
                    break;
                case 2:
                    agregarProductos();
                    break;
                case 3:
                    exportarProductos();
                    break;
                case 4:
                    importarProductos();
                    break;
                case 5:
                    salir();
                    break;

                default:
                    System.out.println("opcion no valida");
            }

        } while (!continuar);
    }

    private void agregarProductos() {
        System.out.println("Crear producto");
        scanner.nextLine();
        System.out.println("Ingrese el nombre del articulo: ");
        String articulo = scanner.nextLine();
        System.out.println("Ingrese precio");
        String precio = scanner.nextLine();
        System.out.println("Ingrese descripcion: ");
        String descripcion = scanner.nextLine();
        System.out.println("Ingrese codigo: ");
        String codigo = scanner.nextLine();
        System.out.println("Ingrese Talla: ");
        String talla = scanner.nextLine();
        System.out.println("Ingrese color: ");
        String color = scanner.nextLine();
        System.out.println("Ingrese marca: ");
        String marca = scanner.nextLine();

        productoServicio.agregarProductos(articulo, precio, descripcion, codigo, talla, marca, color);
        Utilidades.stopAndContinue();
    }

    private void listarProductos() {
        productoServicio.listarProductos();
        Utilidades.stopAndContinue();
    }

    private void exportarProductos() {
        exportarTxt.exportar(fileName, productoServicio.getListaProductos());
        Utilidades.stopAndContinue();
    }

	private void importarProductos() throws Exception {
		importarcsv.cargarDatos("src/jeans/servicios/ProductosImportados.csv");
        Utilidades.stopAndContinue();
    }

    private void salir(){
        utilidades.stop();
    }

    private int construirMenu(List<String> opcionesMenu) {

        List<String> opMenu = opcionesMenu;
        int largo = opMenu.size();

        for (int i = 0; i < largo; i++) {
            System.out.println(i + 1 + " " + opMenu.get(i));
        }

        int opcion = 0;
        System.out.println("Ingrese una opcion: ");

        opcion = scanner.nextInt();

        if (opcion < 1 || opcion >= largo + 1) {
            System.out.println("Seleccion no permitida");
        }

        return opcion;

    }

}
