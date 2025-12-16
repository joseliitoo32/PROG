import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int edad;
        int edadMaxima = Integer.MIN_VALUE;
        int edadMinima = Integer.MAX_VALUE;
        boolean edadesIntroducidas = false;
        

        System.out.println("Introduce una edad (o -1 para terminar):");
        
        edad = sc.nextInt();
        
        while (edad != -1) {
            
            if (edad >= 0) {
                edadesIntroducidas = true;
                
                if (edad > edadMaxima) {
                    edadMaxima = edad;
                }
                
                if (edad < edadMinima) {
                    edadMinima = edad;
                }
            }
            
            System.out.println("Introduce la siguiente edad (o -1 para terminar):");
            edad = sc.nextInt();
        }
        
        sc.close();
        
        if (edadesIntroducidas) {
            System.out.println("Edad Máxima: " + edadMaxima);
            System.out.println("Edad Mínima: " + edadMinima);
        } else {
            System.out.println("No se introdujo ninguna edad válida.");
        }
    }
}