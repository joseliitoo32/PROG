package UD9;

import java.io.BufferedReader;
import java.io.StringReader;

public class Ejercicio7 {

    public static void main(String[] args) {

        try {

            String texto = "Hola";

            BufferedReader br =
                    new BufferedReader(new StringReader(texto));

            System.out.println((char) br.read());

            br.mark(10);

            System.out.println((char) br.read());
            System.out.println((char) br.read());

            br.reset();

            System.out.println("Despues del reset");

            System.out.println((char) br.read());
            System.out.println((char) br.read());

            br.close();

        } catch (Exception e) {

            System.out.println("Error");
        }
    }
}
