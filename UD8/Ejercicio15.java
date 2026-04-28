import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio15 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(50, 10, 100, 20, 5));

        Collections.sort(numeros);
        System.out.println("Ordenada: " + numeros);

        System.out.println("Máximo: " + Collections.max(numeros));
        System.out.println("Mínimo: " + Collections.min(numeros));

        Collections.shuffle(numeros);
        System.out.println("Barajada: " + numeros);
    }
}