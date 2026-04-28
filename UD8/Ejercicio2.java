import java.util.LinkedList;

public class Ejercicio2 {
    public static void main(String[] args) {
        LinkedList<Persona> listaEnlazada = new LinkedList<>();
        listaEnlazada.add(new Persona("Ana"));
        listaEnlazada.add(new Persona("Luis"));
        listaEnlazada.add(new Persona("Elena"));

        System.out.println("Original: " + listaEnlazada);

        // Intercambiar primera y última posición
        if (listaEnlazada.size() >= 2) {
            Persona primera = listaEnlazada.removeFirst();
            Persona ultima = listaEnlazada.removeLast();
            listaEnlazada.addFirst(ultima);
            listaEnlazada.addLast(primera);
        }

        System.out.println("Intercambiada: " + listaEnlazada);
    }
}