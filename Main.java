package ceit.aut.ac.ir;

import ceit.aut.ac.ir.gui.CFrame;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public Main() throws IOException {
    }

    public static void main(String[] args) throws IOException {


        CFrame frame = new CFrame("iNote");
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }


}
