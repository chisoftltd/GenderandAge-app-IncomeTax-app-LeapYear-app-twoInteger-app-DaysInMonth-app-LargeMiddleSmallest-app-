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
 * Write a Java application that can calculate the cost of an 
 * order for a number of identical items. The requirements are that: 
 * The user should be prompted for the following information: 
 * • cost per  item       (as a double value) 
 * • the number of items ordered     (as an integer) 
 * • whether the item is subject to Valued Added Tax (VAT)  
 * (as a char value ‘y’ or ‘n’)
 * The application should then calculate and display the cost of the order, 
 * adding VAT if appropriate. [Note:  when VAT is added it increases the cost 
 * by 20% (i.e. multiplies it by 1.2)]
 */

public class Vat {

    private static String numberReply;
    private static int numberInput;
    private static String vatReply;
    private static char vatInput;
    private static double costInput;
    private static double itemCost;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String costReply;
        StringBuffer totalOutput = new StringBuffer();
        DecimalFormat vatFormat = new DecimalFormat("0.00");

        costReply = JOptionPane.showInputDialog(null, "Enter item cost: ");
        costInput = Double.parseDouble(costReply);

        numberReply = JOptionPane.showInputDialog(null, "Enter number of item(s): ");
        numberInput = Integer.parseInt(numberReply);

        vatReply = JOptionPane.showInputDialog(null, "Enter if Valued Added Tax (VAT) apply (Y/N): ");
        vatInput = Character.toUpperCase(vatReply.charAt(0));

        if (vatInput == 'Y') {
            itemCost = costInput * numberInput * 1.2;
            totalOutput.append("£").append(vatFormat.format(itemCost)).append(" including VAT");
        } else {
            itemCost = costInput * numberInput;
            totalOutput.append("£").append(vatFormat.format(itemCost)).append(" excluding VAT");
        }
        JOptionPane.showMessageDialog(null, totalOutput);
    }

}
