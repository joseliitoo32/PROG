package Ejercicio2;

import java.awt.*;

public class PosicionAbsoluta {
    public static void main(String[] args) {
        Frame f = new Frame("Posicionamiento Absoluto");
        f.setLayout(null); // Aquí desactivamos el layout automático

        Label etiqueta = new Label("Etiqueta fija");
        Button boton = new Button("Botón fijo");

        // x, y, ancho, alto
        etiqueta.setBounds(50, 50, 100, 30);
        boton.setBounds(50, 100, 100, 30);

        f.add(etiqueta);
        f.add(boton);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}