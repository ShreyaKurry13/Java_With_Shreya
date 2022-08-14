package com.company;
import javax.swing.*;
import java.awt.*;

class MyFirstFrame{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
//        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLocation(100,50);
        frame.setBounds(100,100,1000,500);
        frame.setTitle(" My Frame ");

        ImageIcon icon = new ImageIcon("Screenshot(26).png");
        frame.setIconImage(icon.getImage());

        Container c = frame.getContentPane();
        c.setBackground(Color.BLUE);

    }
}