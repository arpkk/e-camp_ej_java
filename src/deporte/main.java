package deporte;

public class main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan");
        Deportista d1 = new Deportista("Maria", "tenis");

        p1.andar();
        d1.andar();
    }
}
