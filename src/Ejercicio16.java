import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0, b=1;
        for(int i=0; i<n; i++) {
            System.out.print(a + " ");
            int aux = a+b;
            a=b; b=aux;
        }
    }
}
