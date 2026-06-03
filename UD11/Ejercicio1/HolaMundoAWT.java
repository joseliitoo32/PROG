import java.awt.*;
import java.awt.event.*;

public class HolaMundoAWT {
    public static void main(String[] args) {
        Frame ventana = new Frame("Ejemplo AWT");
        ventana.setLayout(new FlowLayout());

        Button btnSalir = new Button("Salir");
        Button btnLimpiar = new Button("Limpiar");
        TextField txt = new TextField("Escribe algo...", 20);

        ventana.add(btnSalir);
        ventana.add(btnLimpiar);
        ventana.add(txt);

        ventana.setSize(250, 150);
        ventana.setVisible(true);

        // Cerrar ventana
        ventana.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });
    }
}