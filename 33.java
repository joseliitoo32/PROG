public class SobrecargaFunciones {

    // Función sobrecargada 1: Suma simple de enteros. 
    // Firma: suma(int, int)
    public static int suma(int a, int b) {
        return a + b;
    }

    // Función sobrecargada 2: Suma ponderada. Mismo nombre, PERO...
    // Firma diferente (más parámetros y tipos double). 
    // Firma: suma(int, double, int, double)
    public static double suma(int a, double pesoA, int b, double pesoB) {
        // Fórmula de la diapositiva
        return a * pesoA / (pesoA + pesoB) + b * pesoB / (pesoA + pesoB);
    }

    public static void main(String[] args) {
        // El compilador elige la función 1 por los tipos (int, int)
        int resultadoEntero = suma(10, 20); 
        
        // El compilador elige la función 2 por los tipos (int, double, int, double)
        double resultadoPonderado = suma(5, 0.6, 15, 0.4); 

        System.out.println("Suma simple: " + resultadoEntero);
        System.out.println("Suma ponderada: " + resultadoPonderado);
    }
}