import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digitos = String.valueOf(n).length();
        System.out.println("Número de dígitos: " + digitos);
    }
}
