package com.ibm.Example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
 

public class LambdaSwing extends JFrame {
	private static final long serialVersionUID = 1L;
	private JButton button = new JButton("Click aquí!!!");
    private JTextArea text = new JTextArea();
    
    public LambdaSwing() {
        super("Listener Lambda Example");
 
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(text);
        getContentPane().add(button);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                text.append("Prueba de Clase Anónima\n");
            }
        });
 

 
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setLocationRelativeTo(null);
    }
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LambdaSwing().setVisible(true);
            }
        });
    }
}