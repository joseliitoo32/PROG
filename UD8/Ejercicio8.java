import java.util.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Ejemplo comparativo
        List<String> array = new ArrayList<>(); // Mejor para acceso aleatorio (get)
        List<String> linked = new LinkedList<>(); // Mejor para insertar al inicio/final

        array.add("Dato 1");
        linked.add("Dato 1");

        System.out.println("ArrayList: " + array);
        System.out.println("LinkedList: " + linked);
    }
}