/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part4OptionalProgrammingExercises;

import javax.swing.JOptionPane;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 * 
 * Implement a Java program that prompts the user to enter 3 integer values. 
 * The program should sort the integers and then output the values of the  
 * largest number, middle number,  smallest number, 
 * You will have to design an algorithm that sorts three numbers into order
 * 
 */
public class LargestMiddleSmallest {
    
    /**
     * @param args the command line arguments
     */
    private static String firstReply;
    private static String secondReply;
    private static String thirdReply;
    private static int firstNumber;
    private static int secondNumber;
    private static int thirdNumber;
    private static int largest;
    private static int smallest;
    private static int middleNumber;

    public static void main(String[] args) {
        // TODO code application logic here
        firstReply = JOptionPane.showInputDialog(null, "Enter first number: ");
        secondReply = JOptionPane.showInputDialog(null, "Enter second number: ");
        thirdReply = JOptionPane.showInputDialog(null, "Enter third number: ");

        firstNumber = Integer.parseInt(firstReply);
        secondNumber = Integer.parseInt(secondReply);
        thirdNumber = Integer.parseInt(thirdReply);

        if( firstNumber > secondNumber ){
             if( firstNumber > thirdNumber ){
              largest = firstNumber;
              if( secondNumber > thirdNumber ){
               middleNumber = secondNumber;
               smallest = thirdNumber;
              }else{
               middleNumber = thirdNumber;
               smallest = secondNumber;
              }
             }else{
              middleNumber = firstNumber;
              if( secondNumber > thirdNumber ){
               largest = secondNumber;
               smallest = thirdNumber;
              }else{
               largest = thirdNumber;
               smallest = secondNumber;
              }
             }
            }else{
             if( secondNumber > thirdNumber ){
              largest = secondNumber;
              if( firstNumber > thirdNumber ){
               middleNumber = firstNumber;
               smallest = thirdNumber;
              }else{
               middleNumber = thirdNumber;
               smallest = firstNumber;
              }
             }else{
              middleNumber = secondNumber;
              largest = thirdNumber;
              smallest = firstNumber;
             }
            }
        JOptionPane.showMessageDialog(null, "The largest number is " + largest + ".\n The middel number number is: " + middleNumber + ".\n The smallest number is :"
                + smallest);
    }
}
