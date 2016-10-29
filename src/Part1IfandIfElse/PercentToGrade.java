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
 * Implement a Java program that asks the user to input an integer in the 
 * range 0-100 and then uses the input value display a grade letter A-F 
 * based on the following ranges:   
 * 
 * Values less than 35 correspond to an F   
 * Values 35 or more but less than 40 correspond to an E 
 * Values 40 or more but less than 50 correspond to a D  
 * Values 50 or more but less than 60 correspond to a C  
 * Values 60 or more but less than 70 correspond to a B  
 * Values in the range 70 or more correspond to an A 
 * 
 * Use a set of nested if-else conditions to test the input and display 
 * the appropriate grade. 
 */

public class PercentToGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String gradeReply;
        int gradeInput;

        gradeReply = JOptionPane.showInputDialog(null, "Enter Grade value (0-100) : ");
        gradeInput = Integer.parseInt(gradeReply);

        while (true) {
            if (gradeInput < 0 || gradeInput > 100) {
                gradeReply = JOptionPane.showInputDialog(null, "Enter Grade value (0-100) : ");
                gradeInput = Integer.parseInt(gradeReply);
            } else {
                break;
            }
        }

        if (gradeInput < 35) {
            JOptionPane.showMessageDialog(null, "F grade");
        } else if (gradeInput < 40) {
            JOptionPane.showMessageDialog(null, "E grade");
        } else if (gradeInput < 50) {
            JOptionPane.showMessageDialog(null, "D grade");
        } else if (gradeInput < 60) {
            JOptionPane.showMessageDialog(null, "C grade");
        } else if (gradeInput < 70) {
            JOptionPane.showMessageDialog(null, "B grade");
        } else {
            JOptionPane.showMessageDialog(null, "A grade");
        }
    }
}
