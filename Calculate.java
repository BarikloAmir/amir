package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculate implements ActionListener  {

    //this is jFrame
    private JFrame jFrame = new JFrame();

    /**
     * constructor
     */
    public Calculate(){
        init();

    }

    private void init(){
        jFrame.setSize(400,500);
        jFrame.setLocation(100,150);
        jFrame.setTitle("Calculate2");
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        text();
        addKeys();
        keyHandling();
        addMenu();
        tool();

        jFrame.setVisible(true);
    }


    /**
     * text field
     */
    JTextField textField = new JTextField("0");
    private void text(){
        textField.setSize(300,40);
        textField.setLocation(20,20);
        textField.setEditable(false);
        jFrame.add(textField);
    }


    private void addKeys(){
        JPanel panelOfNumbers = new JPanel();
        panelOfNumbers.setSize(300,300);
        panelOfNumbers.setLocation(20,100);
        panelOfNumbers.setLayout(new GridLayout(5,3));

        for(int i=1 ; i<10 ; i++){
            JButton numberBth = new JButton(""+i);
            numberBth.addActionListener(this);
            panelOfNumbers.add(numberBth);
        }



        JButton equal = new JButton("=");
        equal.setToolTipText("click to see the result");
        panelOfNumbers.add(equal);
        equal.addActionListener(this);

        JButton zero = new JButton("0");
        panelOfNumbers.add(zero);
        zero.addActionListener(this);


        JButton sum = new JButton("+");
        panelOfNumbers.add(sum);
        sum.addActionListener(this);


        JButton Submission = new JButton("-");
        panelOfNumbers.add(Submission);
        Submission.addActionListener(this);

        JButton Division = new JButton("/");
        panelOfNumbers.add(Division);
        Division.addActionListener(this);

        JButton multiply = new JButton("*");
        panelOfNumbers.add(multiply);
        multiply.addActionListener(this);

        jFrame.add(panelOfNumbers);


    }







    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        String temp;
        temp = textField.getText();
        for(int i=0 ; i<12 ; i++){
            if(button.getText().equals(""+i)){
                temp += i;
                textField.setText(temp);}
        }
        if(button.getText().equals("+")){
           temp+="+";
           textField.setText(temp);
        }
        if(button.getText().equals("-")){
            temp+="-";
            textField.setText(temp);
        }
        if(button.getText().equals("*")){
            temp+="*";
            textField.setText(temp);
        }
        if(button.getText().equals("/")){
            temp+="/";
            textField.setText(temp);
        }

    }

    private void keyHandling(){
        jFrame.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
                    System.exit(0);
            }});
        jFrame.setFocusable(true);
    }


    public void addMenu(){
        JMenuBar jmb = new JMenuBar();
        jFrame.setJMenuBar(jmb);

        JMenu menu = new JMenu("menu");
        menu.setMnemonic('M');
        jmb.add(menu);

        JMenuItem item;
        item = new JMenuItem("exit");
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu.add(item);

        JMenuItem item1;
        item1 = new JMenuItem("about");
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"it is workShop of amirHoseinBariklo");
            }
        });
        menu.add(item1);
    }


    private void tool(){
        textField.setToolTipText("your result");
    }




}
