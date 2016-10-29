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
 * (a) The usually remembered rule for
 * determining if a year is a leap year is that a Leap Year is divisible by 4
 * but not divisible by 100 If int year represents the year, express this rule
 * as a logical statement.
 *
 * (b) The full rule for determining if a year is a leap year is that a Leap
 * Year is divisible by 4, but not divisible by 100 unless it is divisible by
 * 400
 *
 * If int year represents the year, express this rule as a logical statement.
 *
 * (c) Implement a Java application that 
 * • asks the user to enter (an integer)year, e.g. 2015 
 * • stores the input as an integer, int year 
 * • displays a message stating whether the input year is a Leap Year or not 
 * • start by using the rule in (a), 
 * • once that works, adapt the program to use the rule in (b)
 */
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String leapYearReply;
        int leapYearInput;
        StringBuffer leapOutput = new StringBuffer();

        for (int i = 0; i < 4; i++) {
            leapYearReply = JOptionPane.showInputDialog(null, "Enter Year (0000): ");
            leapYearInput = Integer.parseInt(leapYearReply);

            while (true) {
                if (leapYearReply.length() != 4) {
                    leapYearReply = JOptionPane.showInputDialog(null, "Enter Year four digits (0000): ");
                    leapYearInput = Integer.parseInt(leapYearReply);
                } else {
                    break;
                }
            }

            /*  if (leapYearInput % 4 == 0 && leapYearInput % 100 != 0) {
                leapOutput = "Year " + leapYearInput + " is a leap year!\n ";
                //leapOutput += leapOutput;
            } else {
                leapOutput = "Year " + leapYearInput + " is not a leap year!\n";
                //leapOutput += leapOutput;
            }
             */
            if (leapYearInput % 4 != 0) {
                leapOutput.append("Year ").append(leapYearInput).append(" is not a leap year!\n");
            } else if (0 == 400 % leapYearInput) {
                leapOutput.append("Year ").append(leapYearInput).append(" is a leap year!\n");
            } else if (leapYearInput % 100 == 0) {
                leapOutput.append("Year ").append(leapYearInput).append(" is not a leap year!\n");
            } else {
                leapOutput.append("Year ").append(leapYearInput).append(" is a leap year!\n");
            }
        }
        JOptionPane.showMessageDialog(null, leapOutput);
    }
}
