import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        // 1 y 2. Crear referencia nula e instanciar ArrayList
        List<Persona> lista = new ArrayList<>();

        // 3. Añadir 3 personas
        lista.add(new Persona("Juan"));
        lista.add(new Persona("Maria"));
        lista.add(new Persona("Pedro"));
        System.out.println("Lista: " + lista);

        // 4. Obtener e imprimir la última
        System.out.println("Última persona: " + lista.get(lista.size() - 1));

        // 5. Modificar nombre de la primera
        lista.get(0).setNombre("Juan Alberto");

        // 6. Eliminar posición central
        lista.remove(lista.size() / 2);
        System.out.println("Después de eliminar central: " + lista);

        // 8. Recorrido con for clásico
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Nombre: " + lista.get(i).getNombre());
        }

        // 9. Comprobar si contiene una persona nueva
        Persona p = new Persona("Laura");
        lista.add(p);
        System.out.println("¿Contiene a Laura?: " + lista.contains(p));

        // 10. Vaciar
        lista.clear();
        System.out.println("¿Está vacía?: " + lista.isEmpty());
    }
}