import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        boolean mayor = edad >= 18;
        System.out.println("¿Mayor de edad?: " + mayor);
    }
}
