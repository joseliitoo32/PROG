import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Parte 1: introducir varios caracteres
        System.out.println("Introduzca varios caracteres");
        System.out.println("Cuando termine, pulse INTRO sin escribir nada");

        String linea = sc.nextLine();

        while (!linea.isEmpty()) {
            System.out.println("Has escrito: " + linea);
            linea = sc.nextLine();
        }

        System.out.println("Fin de la introducción de caracteres");

        // Parte 2: Hola Mundo pidiendo el nombre
        System.out.println("Introduzca su nombre");
        String nombre = sc.nextLine();

        System.out.println("Hola " + nombre + "!");
    }
}
