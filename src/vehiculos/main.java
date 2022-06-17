package vehiculos;

public class main {
    public static void main(String[] args) {
        Cliente cliente1= new Cliente("12355-1","Luis",34);
        Vehiculo vehiculo1 = new Vehiculo("verde","345ed");

        LibroVenta libro = new LibroVenta("Venta1","01102020");
        libro.guardarVenta(cliente1,vehiculo1);
    }
}
