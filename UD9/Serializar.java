package UD9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        try {
            FileOutputStream fichero = new FileOutputStream("persona.dat");

            ObjectOutputStream in = new ObjectOutputStream(fichero);


            System.out.println("Persona leída");
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
