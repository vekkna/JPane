package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String[] cars = {"Corvette", "Porshe", "Lambo"};

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.setVisible(false);
        frame.setSize(420, 420);

        ImageIcon icon = new ImageIcon("car.jfif"); // path to image, beside src

        String favouriteCar = (String)JOptionPane.showInputDialog(

                null,
                "What's your favourite car?",
                "Vroom vroom",
                JOptionPane.PLAIN_MESSAGE,
                icon,
                cars, // dropdown with contents from this array
                cars[1]
        );
        JOptionPane.showMessageDialog(
                frame,
                "Player One selected " + favouriteCar,
                "Vroom vroom",
                JOptionPane.INFORMATION_MESSAGE,
                icon
        );
    }
}