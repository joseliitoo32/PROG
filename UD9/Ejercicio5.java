package UD9;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final String usuarioCorrecto = "Fran";
        final String contrasenaCorrecta = "1234";

        int intentos = 3;

        while (intentos > 0) {

            System.out.println("Introduce el usuario:");
            String usuario = sc.nextLine();

            System.out.println("Introduce la contraseña:");
            String contrasena = sc.nextLine();

            if (usuario.equals(usuarioCorrecto) &&
                    contrasena.equals(contrasenaCorrecta)) {

                System.out.println("Bienvenido");
                break;

            } else {

                intentos--;

                System.out.println("Datos incorrectos");

                if (intentos > 0) {
                    System.out.println("Te quedan " + intentos + " intentos");
                } else {
                    System.out.println("Has agotado los intentos");
                }
            }
        }

        sc.close();
    }
}