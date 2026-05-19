package UD9;

import java.io.File;
import java.io.RandomAccessFile;

public class Ejercicio12 {

    public static void main(String[] args) {

        try {

            File f = new File("abecedario.txt");

            if (f.exists()) {

                f.delete();
            }

            RandomAccessFile raf =
                    new RandomAccessFile(f, "rw");

            raf.writeBytes("defg");

            raf.seek(0);

            String texto = raf.readLine();

            System.out.println(texto);

            texto = "abc" + texto + "hij";

            raf.setLength(0);

            raf.writeBytes(texto);

            texto = texto.replace("a", "*");
            texto = texto.replace("e", "*");
            texto = texto.replace("i", "*");
            texto = texto.replace("o", "*");
            texto = texto.replace("u", "*");

            raf.setLength(0);

            raf.writeBytes(texto);

            raf.seek(0);

            System.out.println(raf.readLine());

            raf.close();

        } catch (Exception e) {

            System.out.println("Error");
        }
    }
}