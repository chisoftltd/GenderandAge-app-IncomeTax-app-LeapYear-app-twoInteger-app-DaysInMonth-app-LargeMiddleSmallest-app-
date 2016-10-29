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
 * Implement a program that prompts the user for two inputs: 
 * 
 * • the first input should ask for a person’s gender and store it as a 
 * char: ‘m’ or ‘f’ 
 * • second input should ask for a person’s age and store it as an integer 
 * 
 * The application should then print a message saying whether the information that
 * has been input implies that the person is a man, woman, boy or girl
 */

public class GenderAndAge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String genderReply;
        char genderInput;

        String ageReply;
        int ageInput;

        genderReply = JOptionPane.showInputDialog(null, "Enter gender (m/f) : ");
        genderInput = genderReply.charAt(0);
        genderInput = Character.toUpperCase(genderInput);

        while (true) {
            if (genderInput != 'M' && genderInput != 'F') {
                genderReply = JOptionPane.showInputDialog(null, "Enter gender (m/f) : ");
                genderInput = genderReply.charAt(0);
                genderInput = Character.toUpperCase(genderInput);
            } else {
                break;
            }
        }

        ageReply = JOptionPane.showInputDialog(null, "Enter Age : ");
        ageInput = Integer.parseInt(ageReply);

        if (ageInput <= 18 && genderInput == 'M') {
            JOptionPane.showMessageDialog(null, "He is a boy");
        } else if (ageInput > 18 && genderInput == 'M') {
            JOptionPane.showMessageDialog(null, "He is a man");
        } else if (ageInput <= 18 && genderInput == 'F') {
            JOptionPane.showMessageDialog(null, "She is a girl");
        } else if (ageInput > 18 && genderInput == 'F') {
            JOptionPane.showMessageDialog(null, "She is a woman.");
        }
    }
}
