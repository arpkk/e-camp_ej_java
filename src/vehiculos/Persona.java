package vehiculos;

/**
 * Write a description of class Persona here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Persona {
    private String rut;
    private String nombre;
    private int edad;

    public Persona(String rut, String nombre, int edad) {
        super();
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
