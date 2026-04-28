import java.util.HashSet;
import java.util.Iterator;

public class Ejercicio11 {
    public static void main(String[] args) {
        HashSet<String> libros = new HashSet<>();
        libros.add("El Quijote");
        libros.add("1984");
        libros.add("El Quijote"); // No se añade

        Iterator<String> it = libros.iterator();
        while (it.hasNext()) {
            System.out.println("Libro: " + it.next());
        }
    }
}