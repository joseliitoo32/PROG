package UD9;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        try {

            RandomAccessFile raf =
                    new RandomAccessFile("record.txt", "rw");

            raf.writeBytes("Nivel:001");

            raf.seek(6);

            raf.writeBytes("005");

            Scanner sc = new Scanner(System.in);

            System.out.println("¿Que nivel quieres poner?");
            int nivel = sc.nextInt();

            String numero =
                    String.format("%03d", nivel);

            raf.seek(6);

            raf.writeBytes(numero);

            raf.seek(0);

            System.out.println(raf.readLine());

            raf.close();
            sc.close();

        } catch (Exception e) {

            System.out.println("Error");
        }
    }
}
