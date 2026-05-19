package UD9;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class Ejercicio8 {

    public static void main(String[] args) {

        try {

            FileWriter fw = new FileWriter("texto.txt", true);

            fw.write("\nTexto añadido desde Java");

            fw.close();

            BufferedReader br =
                    new BufferedReader(new FileReader("texto.txt"));

            String linea;

            while ((linea = br.readLine()) != null) {

                System.out.println(linea);
            }

            br.close();

        } catch (Exception e) {

            System.out.println("Error");
        }
    }
}
