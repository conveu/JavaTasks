package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 {
    private JButton startButton;
    private JPanel panel1;
    private JTextArea textArea1;

    public Form1() {
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"WOAH");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Half-life 3");
        frame.setContentPane(new Form1().panell);
       /* frame.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);*/
    }






}
