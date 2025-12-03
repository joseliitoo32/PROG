import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = String.valueOf(n);
        String invertido = new StringBuilder(str).reverse().toString();
        boolean palindromo = str.equals(invertido);
        System.out.println("¿Es palíndromo?: