/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1IfandIfElse;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 * 
 * UK income tax in the tax year 2015-16 was charged at the following rates: 
 * • the first £10600 of annual income  is not taxed 
 * • income between £10600 and £42385 is taxed at 20%  
 * • any income between £42385 and £160600 is taxed at 40% 
 * • any income above £160600 is taxed at 45% 
 * Implement a Java application, which will prompt the user for their 
 * annual income (use double data type). 
 * The program should calculate and output the amount of tax to be paid. 
 * [Note that some programmers would avoid using the double type for 
 * currency, and would work in pence using an int or long type to 
 * avoid rounding issues. It makes little difference in this example]  
 */
public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    private static String incomeReply;
    private static long incomeInput;
    private static double tax;

    public static void main(String[] args) {
        // TODO code application logic here

        StringBuffer taxOutput = new StringBuffer();
        DecimalFormat incomeFormat = new DecimalFormat("0.00");

        incomeReply = JOptionPane.showInputDialog(null, "Enter income: ");
        incomeInput = (long) Double.parseDouble(incomeReply);

        if (incomeInput <= 10600) {
            tax = incomeInput - incomeInput;
            taxOutput.append("You pay £").append(incomeFormat.format(tax)).append(" for year 2015-16");
        } else if (incomeInput > 10600 && incomeInput <= 42385) {
            tax = incomeInput * .2 ;//- incomeInput;
            taxOutput.append("You pay £").append(incomeFormat.format(tax)).append(" for year 2015-16");
        } else if (incomeInput > 42385 && incomeInput <= 160600) {
            tax = incomeInput * .4;// - incomeInput;
            taxOutput.append("You pay £").append(incomeFormat.format(tax)).append(" for year 2015-16");
        } else {
            tax = incomeInput * .45;// - incomeInput;
            taxOutput.append("You pay £").append(incomeFormat.format(tax)).append(" for year 2015-16");
        }
        JOptionPane.showMessageDialog(null, taxOutput);
    }
}
