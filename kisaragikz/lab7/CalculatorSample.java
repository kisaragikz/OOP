/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author kisaragi
 */
import java.awt.*;
import javax.swing.*;
public class CalculatorSample {
    private JFrame fr;
    private JButton bn0, bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, bn10, bn11, bn12, bn13, bn14, bn15;
    private JPanel p1, p2;
    private JTextField t;
    public CalculatorSample() {
        fr = new JFrame("My Calculator");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bn0 = new JButton("0");
        bn1 = new JButton("1");
        bn2 = new JButton("2");
        bn3 = new JButton("3");
        bn4 = new JButton("4");
        bn5 = new JButton("5");
        bn6 = new JButton("6");
        bn7 = new JButton("7");
        bn8 = new JButton("8");
        bn9 = new JButton("9");
        bn10 = new JButton("+");
        bn11 = new JButton("-");
        bn12 = new JButton("X");
        bn13 = new JButton("/");
        bn14 = new JButton("c");
        bn15 = new JButton("=");
        t = new JTextField();
        p1 = new JPanel();
        p2 = new JPanel();
        t.setEnabled(false);
        p1.setLayout(new GridLayout(1, 1));
        p1.add(t);
        p2.setLayout(new GridLayout(4, 4));
        p2.add(bn7);
        p2.add(bn8);
        p2.add(bn9);
        p2.add(bn10);
        p2.add(bn4);
        p2.add(bn5);
        p2.add(bn6);
        p2.add(bn11);
        p2.add(bn1);
        p2.add(bn2);
        p2.add(bn3);
        p2.add(bn12);
        p2.add(bn0);
        p2.add(bn14);
        p2.add(bn15);
        p2.add(bn13);
        fr.setLayout(new BorderLayout());
        fr.add(p1, BorderLayout.NORTH);
        fr.add(p2, BorderLayout.CENTER);
        fr.setSize(400, 400);
        fr.setVisible(true);
    }
    // public static void main(String args[]) {
    //     new CalculatorSample();
    // }
}
