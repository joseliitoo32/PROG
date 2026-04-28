import java.util.HashMap;
import java.util.Map;

public class Ejercicio13 {
    public static void main(String[] args) {
        Map<String, Integer> inventario = new HashMap<>();
        
        inventario.put("Manzanas", 50);
        inventario.put("Peras", 30);
        inventario.put("Naranjas", 20);

        System.out.println("Stock de Naranjas: " + inventario.get("Naranjas"));
        
        // Actualizar manzanas
        inventario.put("Manzanas", 100);

        // Recorrer mapa
        for (Map.Entry<String, Integer> entrada : inventario.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }
    }
}