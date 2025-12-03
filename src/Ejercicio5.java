import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce nota 1: ");
        int n1 = sc.nextInt();
        System.out.print("Introduce nota 2: ");
        int n2 = sc.nextInt();
        double media = (n1 + n2) / 2.0;
        System.out.println("La media es: " + media);
    }
}
