import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(List.of("Ana", "Pedro", "Luis"));

        // Convertir Lista a Array de Strings
        String[] arrayNombres = nombres.toArray(new String[0]);

        System.out.println("Elemento en array[1]: " + arrayNombres[1]);
    }
}