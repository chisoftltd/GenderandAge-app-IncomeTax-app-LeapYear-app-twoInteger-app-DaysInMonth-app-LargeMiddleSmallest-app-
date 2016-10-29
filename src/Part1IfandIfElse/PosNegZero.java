/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1IfandIfElse;

import javax.swing.JOptionPane;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 * 
 * Implement a Java program that prompts the user to enter an integer number. 
 * Then  
 * • if the number is positive the program should display:  positive 
 * • if the number is negative the program should display:  negative 
 * • if the number is zero the program should display:   zero 
 */
public class PosNegZero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String reply;
        int numberInput;

        reply = JOptionPane.showInputDialog(null, "Enter Integer Number");
        numberInput = Integer.parseInt(reply);

        if (numberInput > 0) {
            JOptionPane.showMessageDialog(null, "Number Positive");
        }
        if (numberInput < 0) {
            JOptionPane.showMessageDialog(null, "Number Negative");
        }
        if (numberInput == 0) {
            JOptionPane.showMessageDialog(null, "Number zero");
        }
    }

}
