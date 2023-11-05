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
public class Ipfinder extends JFrame //implements ActionListener 
{
    JLabel l;  
    JTextField tf;  
    JButton b;  
    Ipfinder()
    {
        super("Urvi's IP Finder App");
        l=new JLabel("Enter URL");
        l.setForeground(Color.blue);
        add(l);
        setSize(500,500);
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Ipfinder();
    }
    
}
