/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.creatingframes;

/**
 *
 * @author E-LAB-PC28
 */
import java.awt.*;
import java.awt.event.*;
public class CreatingFrames extends Frame{
    Frame f1;
    Label l1;
    Button b1,b2;
    
    public CreatingFrames()
    {
       f1 = new Frame("Welcome to Java Frames");
       l1 = new Label("Hello Batch 14");
       b1 = new Button("Click Me");
       b2 = new Button("Close");
       f1.setSize(500,400);
       f1.setLayout(new FlowLayout());
       f1.setLayout(new GridLayout(1,3));
       f1.add(l1);
       f1.add(b1);
       f1.add(b2);
       f1.setVisible(true);
       f1.addWindowListener(new WindowAdapter()
       {
       public void windowClosing(WindowEvent e)
       {
         System.exit(0);
       }
       });
        
    }
    public static void main(String[] args) {
        CreatingFrames f1 = new CreatingFrames();
    }
}
