package com.company;

import javax.swing.*;
import java.awt.*;

public class CalculatorGUI {
    JFrame calcFrame;
    public CalculatorGUI() {
        calcFrame = new JFrame();
        calcFrame.setTitle("AUT Calculator");
        calcFrame.setSize(300, 300);
        calcFrame.setLocation(100, 200);
        calcFrame.setLayout(null);
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel keyboardPanel = new JPanel();
        keyboardPanel.setSize(300,300);
        keyboardPanel.setLocation(100, 200);
        keyboardPanel.setLayout(new GridLayout(4,3));
        calcFrame.add(keyboardPanel);
        for (int i = 9; i > 0; i--) {
            JButton btn = new JButton();
            btn.setText("" + i);
            keyboardPanel.add(btn);
        }
        JButton sumBtn = new JButton();
        sumBtn.setText("+");
        keyboardPanel.add(sumBtn);
        JButton zeroBtn = new JButton();
        zeroBtn.setText("0");
        keyboardPanel.add(zeroBtn);
        JButton doBtn = new JButton();
        doBtn.setText("=");
        keyboardPanel.add(doBtn);

        JTextArea display = new JTextArea(3,10);
        display.setEditable(false);
        display.setFont(new Font("amir", 14,14));

        display.append("amir");
        display.append("\nbariklo");


        JScrollPane scrollPane = new JScrollPane(display);
        scrollPane.setPreferredSize(new Dimension(200, 100));
        scrollPane.setLocation(50,20);
        calcFrame.getContentPane().add(scrollPane);
        calcFrame.add(scrollPane);
        keyboardPanel.add(scrollPane);

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
// If Nimbus is not available, you can set the GUI to another look and feel.
        }

        JPanel engKeyboard=new JPanel();
        engKeyboard.setSize(500,500);
        engKeyboard.setLocation(100, 200);
        calcFrame.add(keyboardPanel);
        engKeyboard.setLayout(new GridLayout(4,5));
        for (int i = 9; i > 0; i--) {
            JButton btn = new JButton();
            btn.setText("" + i);
            engKeyboard.add(btn);
        }
        JButton engSum = new JButton();
        sumBtn.setText("+");
        engKeyboard.add(engSum);

        JButton engMines = new JButton();
        engMines.setText("-");
        engKeyboard.add(engMines);

        JButton zero = new JButton();
        zero.setText("0");
        engKeyboard.add(zero);

        JButton sinAndCos = new JButton();
        sinAndCos.setText("sin/cos");
        engKeyboard.add(sinAndCos);

        JButton tanAndCot = new JButton();
        tanAndCot.setText("tan/cot");
        engKeyboard.add(tanAndCot);

        JButton shift = new JButton();
        shift.setText("shift");
        engKeyboard.add(shift);

        JTabbedPane tp=new JTabbedPane();
        tp.setBounds(50,50,200,200);
        tp.add("enginier",engKeyboard);
        tp.add("simple",keyboardPanel);

        calcFrame.add(tp);


        calcFrame.setVisible(true);
    }
}