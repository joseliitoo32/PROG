import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int suma = 0;
        while(n > 0) {
            suma += n % 10;
            n /= 10;
        }
        System.out.println("Suma de dígitos: " + suma);
    }
}
