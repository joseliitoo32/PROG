import java.util.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>(List.of(
            new Persona("Ana", "Zafra", 25),
            new Persona("Ana", "Alba", 30),
            new Persona("Pedro", null, 40)
        ));

        // Comparador combinado: Apellidos (nulls first), luego Nombre, luego Edad
        Comparator<Persona> comparador = Comparator
            .comparing(Persona::getApellidos, Comparator.nullsFirst(String::compareTo))
            .thenComparing(Persona::getNombre)
            .thenComparingInt(Persona::getEdad);

        lista.sort(comparador);
        
        System.out.println("Lista ordenada por comparador:");
        lista.forEach(System.out::println);
    }
}