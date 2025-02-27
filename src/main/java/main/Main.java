package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi Ventana");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Crea un botón
        JButton boton = new JButton("Pulsa aquí");
        boton.setBounds(150, 100, 120, 40);  


        frame.add(boton);


        frame.setVisible(true);
    }
}
