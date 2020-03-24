package com.company;

import javax.swing.*;

public class Main {
    public static void creatGUI() {
        JFrame frame = new JFrame("Cov-19 Visualized");
        frame.setSize(700, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("世界概况", null);

        frame.add(button);
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                creatGUI();
            }
        });
    }
}