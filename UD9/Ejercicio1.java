import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime 4 caracteres:");
        String t = sc.nextLine();

        // 1. write
        System.out.write(t.charAt(0));

        // 2. print
        System.out.print(t.charAt(1));

        // 3. println
        System.out.println(t.charAt(2));

        // 4. printf
        System.out.printf("%c", t.charAt(3));
    }
}
