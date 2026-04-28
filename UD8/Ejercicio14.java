import java.util.TreeMap;
import java.util.Map;

public class Ejercicio14 {
    public static void main(String[] args) {
        // Ordena por la clave (en este caso el código postal)
        Map<String, String> ciudades = new TreeMap<>();

        ciudades.put("28001", "Madrid");
        ciudades.put("08001", "Barcelona");
        ciudades.put("41001", "Sevilla");

        System.out.println("Ciudades ordenadas por CP:");
        for (String cp : ciudades.keySet()) {
            System.out.println(cp + " -> " + ciudades.get(cp));
        }
    }
}