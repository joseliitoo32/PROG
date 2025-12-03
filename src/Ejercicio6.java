import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el radio: ");
        double r = sc.nextDouble();
        final double PI = Math.PI;
        double longitud = 2 * PI * r;
        double area = PI * r * r;
        System.out.println("Longitud: " + longitud);
        System.out.println("Área: " + area);
    }
}
