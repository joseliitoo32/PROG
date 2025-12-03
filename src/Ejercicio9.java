import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Está lloviendo? (true/false): ");
        boolean lluvia = sc.nextBoolean();
        System.out.print("¿Has terminado las tareas? (true/false): ");
        boolean tareas = sc.nextBoolean();
        System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
        boolean biblioteca = sc.nextBoolean();

        boolean salir = (!lluvia && tareas) || biblioteca;
        System.out.println("¿Puedes salir?: " + salir);
    }
}
