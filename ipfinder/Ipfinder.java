/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipfinder;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.net.*;
/**
 *
 * @author lenovo
 */
public class Ipfinder extends JFrame implements ActionListener 
{
    JLabel l;  
    JTextField tf;  
    JButton b;  
    Ipfinder()
    {
        super("Urvi's IP Finder App");
        l=new JLabel("Enter URL");
        l.setBounds(50,70,150,20);
        tf=new JTextField();
        tf.setBounds(50,100,200,20);
        b=new JButton("Find IP");
        b.setBounds(50,150,80,30);
        b.addActionListener(this);
        l.setForeground(Color.blue);
        add(l);
        add(tf);
        add(b);
         setSize(300,300);
         setLayout(null);
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Ipfinder();
    }
    public void actionPerformed(ActionEvent ae)
    {
    }
    
}
