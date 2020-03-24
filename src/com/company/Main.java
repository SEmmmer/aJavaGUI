package com.company;

import javax.swing.*;

public class Main {
    public static class HelloWorldSwing {
        private static void createAndShowGUI() {
            // 确保一个漂亮的外观风格
            JFrame.setDefaultLookAndFeelDecorated(true);

            // 创建及设置窗口
            JFrame frame = new JFrame("covid-19");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // 添加 "Hello World" 标签
            JLabel label = new JLabel("Hello World");
            frame.getContentPane().add(label);

            // 显示窗口
            frame.pack();
            frame.setVisible(true);
        }
        
        public static void main(String[] args) {
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
        }


    }
}