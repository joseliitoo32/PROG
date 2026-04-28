import java.util.LinkedHashSet;
import java.util.Set;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Mantiene el orden en el que se añadieron los elementos
        Set<String> colaEspera = new LinkedHashSet<>();

        colaEspera.add("Cliente A");
        colaEspera.add("Cliente B");
        colaEspera.add("Cliente C");

        System.out.println("Orden de llegada: " + colaEspera);
    }
}