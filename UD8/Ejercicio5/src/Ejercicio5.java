import java.util.HashSet;
import java.util.Set;

public class Ejercicio5 {

    public static void main(String[] args) {
        Set<Integer> conjuntoEnteros = new HashSet<>();
        conjuntoEnteros.add(1);
        conjuntoEnteros.add(2);
        conjuntoEnteros.add(3);
        conjuntoEnteros.add(4);
        conjuntoEnteros.add(5);
        //System.out.println(conjuntoEnteros);

        conjuntoEnteros.add(4);
        //System.out.println(conjuntoEnteros);

        //conjuntoEnteros.add(null);
        //System.out.println(conjuntoEnteros);

        Set<Integer> numerosPrimos = new HashSet<>(2,3);
        numerosPrimos.add(2);
        numerosPrimos.add(3);
        System.out.println(conjuntoEnteros);
        System.out.println(numerosPrimos);
        boolean contenido = conjuntoEnteros.containsAll(numerosPrimos);
        conjuntoEnteros.containsAll(numerosPrimos)?System.out.println("Sí");

    }
}