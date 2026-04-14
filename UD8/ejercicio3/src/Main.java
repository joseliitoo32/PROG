import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        nombres.add("Jose");
        nombres.add("Óscar");
        nombres.add("Daniel");
        nombres.add("Raúl");
        nombres.add("Adrián");

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un nuevo nombre: ");
        String nombre = sc.nextLine();

        nombres.add(nombre);

        imprime(nombres);

        System.out.println("Introduce nombre a eliminar: ");
        String eliminarNombre = sc.nextLine();

        if (nombres.remove(eliminarNombre)) {
            System.out.println("Nombre eliminado");
        } else {
            System.out.println("Nombre no encontrado");
        }

        System.out.println();
    }

    private static void imprime(List<String> lista) {
        for (String string : lista) {
            System.out.println(nombre);
        }
    }
}