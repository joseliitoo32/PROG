import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EjercicioAccesoSecuencial {
    public static void main(String[] args) {
        String nombreArchivo = "ejercicio10.txt";
        File archivo = new File(nombreArchivo);

        try {
            // 1. Verificar existencia e información
            if (archivo.exists()) {
                System.out.println("El archivo ya existe.");
                System.out.println("Tamaño: " + archivo.length() + " bytes.");
            } else {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado correctamente.");
                }
            }
            System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());

            // 2. Añadir contenido al final (true = append mode)
            try (FileWriter escritor = new FileWriter(archivo, true)) {
                escritor.write("Nueva línea de contenido añadida.\n");
                System.out.println("Contenido añadido.");
            }

            // 3. Mostrar el contenido del fichero
            System.out.println("\n--- Contenido actual del archivo ---");
            try (FileReader lector = new FileReader(archivo)) {
                int caracter;
                while ((caracter = lector.read()) != -1) {
                    System.out.print((char) caracter);
                }
            }

        } catch (IOException e) {
            System.err.println("Error en la operación de E/S: " + e.getMessage());
        }
    }
}