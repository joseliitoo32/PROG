import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();
        Persona p1 = new Persona("Roberto");
        
        lista.add(p1);
        lista.add(new Persona("Lucía"));

        // 1. Uso de contains
        System.out.println("¿Está Roberto en la lista?: " + lista.contains(p1));

        // 2. Uso de indexOf
        System.out.println("Posición de Roberto: " + lista.indexOf(p1));

        // 3. Uso de isEmpty y clear
        System.out.println("¿Lista vacía?: " + lista.isEmpty());
        lista.clear();
        System.out.println("¿Vacía tras clear?: " + lista.isEmpty());
    }
}