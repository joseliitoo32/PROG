import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String invertido = new StringBuilder(String.valueOf(n)).reverse().toString();
        System.out.println("Invertido: " + invertido);
    }
}
