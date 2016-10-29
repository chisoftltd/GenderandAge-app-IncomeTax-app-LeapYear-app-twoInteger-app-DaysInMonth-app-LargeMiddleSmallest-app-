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
 * Implement a Java program that prompts the * user to enter two integer values. 
 * Then 
 * • if both numbers are positive the  program should display: both positive 
 * • if both numbers are negative the  program should display: both negative 
 * • if one number is positive and the other is negative display: opposite signs
 */
public class TwoIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String reply1;
        String reply2;
        int numberInput1;
        int numberInput2;
       

        reply1 = JOptionPane.showInputDialog(null, "Enter First Integer Number");
        numberInput1 = Integer.parseInt(reply1);

        reply2 = JOptionPane.showInputDialog(null, "Enter Second Integer Number");
        numberInput2 = Integer.parseInt(reply2);

        

        if (numberInput1 > 0 && numberInput2 > 0) {
            JOptionPane.showMessageDialog(null, "Both Numbers Positive");
        }
        else if (numberInput1 < 0 && numberInput2 < 0) {
            JOptionPane.showMessageDialog(null, "Both Numbers Negative");
        }
        else if (numberInput1 > 0 || numberInput2 > 0 && numberInput1 > 0 || numberInput2 > 0) {
            JOptionPane.showMessageDialog(null, "Numbers are of opposite signs");
        }
    }

}
