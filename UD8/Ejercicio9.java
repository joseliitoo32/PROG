import java.util.TreeSet;
import java.util.Set;

public class Ejercicio9 {
    public static void main(String[] args) {
        // 1. Colección que no permite repetidos y ordena naturalmente (TreeSet)
        Set<Persona> conjunto = new TreeSet<>();

        // 2. Añadir personas
        conjunto.add(new Persona("Zaira"));
        conjunto.add(new Persona("Alberto"));
        conjunto.add(new Persona("Bernardo"));
        conjunto.add(new Persona("Alberto")); // Repetido, no se añadirá

        // 3. Mostrar (Aparecerán por orden alfabético gracias al compareTo de Persona)
        System.out.println("Conjunto ordenado: " + conjunto);
    }
}