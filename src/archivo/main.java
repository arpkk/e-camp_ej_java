package archivo;

public class main {
    public static void main(String[] args) {
        Archivo.crearFile("src/directorio", "src/directorio/fichero.txt");
        Archivo.buscarTexto("src/directorio/fichero.txt", "Perro");
    }
}
