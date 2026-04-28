import java.util.TreeSet;
import java.util.Set;

public class Ejercicio6 {
    public static void main(String[] args) {
        // TreeSet ordena los elementos automáticamente
        Set<Integer> numeros = new TreeSet<>();

        numeros.add(50);
        numeros.add(10);
        numeros.add(30);

        System.out.println("Números ordenados: " + numeros);
    }
}