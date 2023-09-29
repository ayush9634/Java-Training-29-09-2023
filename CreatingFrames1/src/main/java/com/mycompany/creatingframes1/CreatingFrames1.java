/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.creatingframes1;

/**
 *
 * @author E-LAB-PC28
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CreatingFrames1 {

    public static void main(String[] args) 
    {
        Abc obj = new Abc();
    }
}
class Abc extends JFrame implements ActionListener
{
    JTextField t1,t2;
    JButton b;
    JLabel l1,l2;
    //to show something
    public Abc()
    {
        t1 = new JTextField(20);
           l1 = new JLabel("+");
        t1 = new JTextField(20);
        b = new JButton("Click Me");
     
        l2 = new JLabel("Result");
        add(t1);
        add(t2);
        add(b);
        add(l1);
        add(l2);
        b.addActionListener(this);
        setLayout(new FlowLayout());
        JLabel l = new JLabel("Hi Welcome");
        JLabel l1 = new JLabel("Listen to Trainer");
        add(l1);
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent e) {
       int num1 = Integer.parseInt(t1.getText());
       int num2 = Integer.parseInt(t2.getText());
       int value = num1+num2;
       l2.setText(value+"");
    }
}
