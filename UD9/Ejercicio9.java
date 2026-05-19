package UD9;

import java.io.*;

public class Ejercicio9 {

    public static void main (String[] args) {

     try {

         File file = new File("notas.txt");

         if (file.exists()) {
             System.out.println(file.getName());
             System.out.println(file.getAbsolutePath());

         } else {
             System.out.println("El archivo no existe");
         }

     } catch (Exception e) {
         throw new RuntimeException(e);
     }


    }
}
