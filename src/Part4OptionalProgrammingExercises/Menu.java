/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part4OptionalProgrammingExercises;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 * 
 * Design and implement a java application that 
 * (a) displays an input dialog containing a message 
 * A    chocolate [75p]    
 * B    toffee [60p]    
 * C    cookie [90p]    
 * Please enter your choice of product 
 * 
 * (b) takes the user input (a char  A, B or C)  and, using a switch statement:
 * assigns the relevant numerical value to an int itemPrice assigns the relevant
 * text to a String itemName 
 * 
 * (c) displays an input dialog containing a message 
 * How many items do you require and converts the user input and assigns it to 
 * an integer number 
 * (d) displays a message dialog summarising the order and giving the total cost
 * e.g. for an order of 4 cookies display  
 * 
 * “Your order is for 4 cookies and will cost 360p” 
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    private static String orderReply;
    private static double itemPrice;
    private static String itemName;
    private static int orderNumber;
    private static StringBuffer totalPrice;

    public static void main(String[] args) {
        // TODO code application logic here

        StringBuffer order0utput = new StringBuffer();
        DecimalFormat orderFormat = new DecimalFormat("0.00");

        orderReply = JOptionPane.showInputDialog(null, "A    chocolate [75p]\n"
                + "B    toffee [60p]\n"
                + "C    cookie [90p]\n"
                + "Please enter your choice of product ");
        char orderInput = Character.toLowerCase(orderReply.charAt(0));

        while ((orderInput != 'a') && (orderInput != 'b') && (orderInput != 'c')) {
            orderReply = JOptionPane.showInputDialog(null, "Please only (A B C)\n"
                    + "A    chocolate [75p]\n"
                    + "B    toffee [60p]\n"
                    + "C    cookie [90p]\n"
                    + "Please enter your choice of product ");
            orderInput = Character.toLowerCase(orderReply.charAt(0));
        }
        
        
        switch (orderInput) {
            case 'a':
                itemPrice = .75;
                itemName = "Chocolate";
                break;
            case 'b':
                itemPrice = .60;
                itemName = "Toffee";
                break;
            case 'c':
                itemPrice = .90;
                itemName = "Cookie";
                break;
            default:

        }
        orderNumber = Integer.parseInt(JOptionPane.showInputDialog("How many items do you require?"));
        totalPrice = order0utput.append(orderFormat.format(orderNumber * itemPrice));
        JOptionPane.showMessageDialog(null, "Your order is for " + orderNumber + " " + itemName + " and will cost " + totalPrice);
    }
}
