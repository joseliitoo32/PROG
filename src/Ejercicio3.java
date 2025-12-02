
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el año actual: ");
        int año = sc.nextInt();

        System.out.print("Introduce el año de nacimineto: ");
        int nac = sc.nextInt();
        
        int edad = año - nac ;

        System.out.println("Tienes: " + edad + " años");
    }
}