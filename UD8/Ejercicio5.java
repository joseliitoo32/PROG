import java.util.HashSet;
import java.util.Set;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Un Set no permite elementos repetidos
        Set<String> paises = new HashSet<>();

        paises.add("España");
        paises.add("Francia");
        paises.add("España"); // Este no se añadirá

        System.out.println("Lista de países (sin repetidos): " + paises);
        System.out.println("Tamaño del conjunto: " + paises.size());
    }
}