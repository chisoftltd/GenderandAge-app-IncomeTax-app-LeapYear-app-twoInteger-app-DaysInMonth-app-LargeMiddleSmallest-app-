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
 * range 1 .. 12 representing a month of the year.  The program will output the 
 * number of days in the corresponding month.   Ignore leap years i.e. assume 
 * that month 2 (i.e. February) always has 28 days. 
 * 
 * Once it works, try and improve your program by adding extra code inside the
 * “february” case (e.g. add a user prompt to ask the user if it is a leap year,
 * and an if-else statement to handle the two possible cases to give the 
 * appropriate output).   
 */
public class DaysInMonth {

    /**
     * @param args the command line arguments
     */
    private static int numberInput;
    private static char yearChar;
    private static char replyChar;

    public static void main(String[] args) {
        // TODO code application logic here

        StringBuffer monthOutput = new StringBuffer();

        while (true) {

            numberInput = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Enter number (1...12: "));
            switch (numberInput) {
                case 1:
                    monthOutput.append("January has 31 days");
                    break;
                case 2:
                    yearChar = Character.toLowerCase(JOptionPane.showInputDialog(null, "Is is a leap year (Y/N)? ").charAt(0));
                    if (yearChar == 'y') {
                        monthOutput.append("Febuary has 29 days! A leap year!");
                    } else {
                        monthOutput.append("Febuary has 28 days!");
                    }
                    break;
                case 3:
                    monthOutput.append("March has 31 days");
                    break;
                case 4:
                    monthOutput.append("April has 30 days");
                    break;
                case 5:
                    monthOutput.append("May has 31 days");
                    break;
                case 6:
                    monthOutput.append("June has 30 days");
                    break;
                case 7:
                    monthOutput.append("July has 31 days");
                    break;
                case 8:
                    monthOutput.append("August has 31 days");
                    break;
                case 9:
                    monthOutput.append("September has 30 days");
                    break;
                case 10:
                    monthOutput.append("October has 31 days");
                    break;
                case 11:
                    monthOutput.append("November has 30 days");
                    break;
                case 12:
                    monthOutput.append("December has 31 days");
                    break;
                default:
                    monthOutput.append("Wrong choice");

            }
            JOptionPane.showMessageDialog(null, "The entered month is " + monthOutput);
            monthOutput.delete(0, monthOutput.length());
            replyChar = Character.toLowerCase(JOptionPane.showInputDialog(null, "Enter more data (Y/N)? ").charAt(0));
            if (replyChar == 'y') {
                continue;
            } else {
                break;
            }

        }
    }
}
