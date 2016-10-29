/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part2SwitchStatements;

import javax.swing.JOptionPane;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 * 
 * Write a Java program that will prompt the user to enter a number in the 
 * range 1 .. 7.  The program will output the full name of corresponding day 
 * of the week.  For example if the user enters 1 then the program will output 
 * "monday".  If the user enters 7 then the program will output “sunday" etc.  
 */
public class DaysofWeek {

    /**
     * @param args the command line arguments
     */

    private static String numberReply;
    private static int numberInput;

    public static void main(String[] args) {
        // TODO code application logic here

        StringBuffer weekDayOutput = new StringBuffer();

        numberReply = JOptionPane.showInputDialog(null, "Enter number (1...7: ");
        numberInput = Integer.parseInt(numberReply);

        switch (numberInput) {
            case 1:
                weekDayOutput.append("Monday");
                break;
            case 2:
                weekDayOutput.append("Tusday");
                break;
            case 3:
                weekDayOutput.append("Wedensday");
                break;
            case 4:
                weekDayOutput.append("Thurday");
                break;
            case 5:
                weekDayOutput.append("Friday");
                break;
            case 6:
                weekDayOutput.append("Saturday");
                break;
            case 7:
                weekDayOutput.append("Sunday");
                break;
            default:
                weekDayOutput.append("Wrong day");

        }

        JOptionPane.showMessageDialog(null, "The entered day is "+weekDayOutput);
    }
}
