public class Persona {
    private String nombre;

    // Constructor que recibe el nombre
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el nombre (opcional, pero útil)
    public String getNombre() {
        return nombre;
    }

    // Setter para modificar el nombre (lo vas a necesitar más adelante)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Para que se vea el nombre al imprimir la persona
    @Override
    public String toString() {
        return nombre;
    }
}