package UD9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {

        Persona p = new Persona("JC Romero", 48);

        try {

            FileOutputStream archivo = new FileOutputStream("persona.dat");

            ObjectOutputStream escribir = new ObjectOutputStream(archivo);

            escribir.writeObject(p);

            escribir.close();

            System.out.println("Persona guardada");

        } catch (Exception e) {

            System.out.println("Error al guardar");

        }

        try {
            FileOutputStream fichero = new FileOutputStream("persona.dat");

            ObjectOutputStream in = new ObjectOutputStream(fichero);

            Persona p = (Persona) in.readObjet();

            in.close();

            System.out.println("Persona leída");
            System.out.println(p);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}