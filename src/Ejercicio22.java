import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in); 
        int n = 1;       

        while (n > 0) {
            
            System.out.println("Introduce un número entero (0 o negativo para salir):");
            n = sc.nextInt();
            
            if (n % 2 == 0 && n > 0) {
                 System.out.println("El número " + n + " es par y positivo");
                 
            } else if (n > 0) {
                 System.out.println("El número " + n + " es impar y positivo");
            }
        }
        
        System.out.println("Fin");
        
    }
}