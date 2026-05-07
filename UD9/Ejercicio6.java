import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuál es tu nombre");
        String nombre = sc.nextLine();

        System.out.println("Cuantos años crees que vivirás");
        int aniosVivo = sc.nextInt();

        int fechaMuerte = aniosVivo + 10;

        System.out.println("Hola "+ nombre +" los atros dicen que morirás a los "+ fechaMuerte + " por culpa de un café frío");
    }
    }