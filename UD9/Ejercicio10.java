package UD9;

import java.io.*;

public class Ejercicio10 {

    public static void main (String[] args) {

     try {
         File miFichero10 = new File("Ejercicio10.txt");
         if (miFichero10.createNewFile()) {
             System.out.println("Archivo creado: " +miFichero10.getName());
         } else {
             System.out.println("El archivo ya existe");
         }

         FileWriter fw = new FileWriter("Ejercicio10.txt");
         fw.write("Escribiendo en Ejercicio10.txt");
         fw.close();



     } catch (IOException e) {
         throw new RuntimeException(e);
     }



    }
}
