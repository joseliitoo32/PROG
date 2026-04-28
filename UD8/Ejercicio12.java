import java.util.HashMap;
import java.util.Map;

public class Ejercicio12 {
    public static void main(String[] args) {
        Map<Integer, String> alumnos = new HashMap<>();

        // put para añadir
        alumnos.put(1, "Carlos");
        alumnos.put(2, "Marta");

        // get y containsKey
        if (alumnos.containsKey(1)) {
            System.out.println("ID 1 pertenece a: " + alumnos.get(1));
        }

        // keySet y values
        System.out.println("IDs registrados: " + alumnos.keySet());
        System.out.println("Nombres registrados: " + alumnos.values());
    }
}