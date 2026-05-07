
import java.io.FileWriter;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        // Creamos el escritor hacia un archivo
        FileWriter escritor = new FileWriter("prueba.txt");

        // Escribimos algo
        escritor.write("¿Donde está mi texto?");
        escritor.close();
        System.out.println("He escrito en el archivo... ¿o no?");

        // El programa se queda esperando aquí para que no termine
        Thread.sleep(10000); // Espera 10 segundos

        // No hemos puesto ni flush() ni close()
    }
}

// ¿Se ha escrito algo en prueba.txt? ¿por qué?
// No, porque no hemos cerrado el Writer

//¿Cómo lo arreglarias? Hazlo y compruebalo.
// Añadiento un close manualmente