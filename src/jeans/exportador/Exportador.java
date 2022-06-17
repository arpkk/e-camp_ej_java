package jeans.exportador;

import jeans.modelo.Producto;

import java.util.List;


/**
 * 
 * @author jorge
 * Clase abstracta que solo define un metodo con atributos pero sin implementacion.
 */
public abstract class Exportador {
	
	public abstract void exportar(String fileName, List<Producto> listaProductos);
	
}
