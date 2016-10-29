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
 * Implement a Java application that solves the quadratic equation +  +  = 0 
 * • ask the user to enter three double values (, , and ) 
 * • calculate a double value  =  ×  − 4 ×  ×  
 * • if  < 0 then display “That quadratic does not have any solutions” 
 * • if  = 0 then there is one solution given by  = − , so display the 
 * solution within a  message such as “That quadratic has one solution   =“
 * • if  > 0 then there are two solutions 1 = √   and 2 = √ , display the 
 * solutions in a message such as “That quadratic has two solutions  1=       
 * and  2   =  
 * To calculate a square root of value  in Java, use the method Math.sqrt(x
 */
public class Quadratic {

    /**
     * @param args the command line arguments
     */
    private static String aReply;
    private static double aInput;
    private static String bReply;
    private static double bInput;
    private static String cReply;
    private static double cInput;
    private static double d;

    public static void main(String[] args) {
        // TODO code application logic here

        StringBuffer equation0utput = new StringBuffer();
        DecimalFormat equationFormat = new DecimalFormat("0.00");

        aReply = JOptionPane.showInputDialog(null, "Enter values for Quadratic equation a: ");
        aInput = Double.parseDouble(aReply);

        bReply = JOptionPane.showInputDialog(null, "Enter values for Quadratic equation b: ");
        bInput = Double.parseDouble(bReply);

        cReply = JOptionPane.showInputDialog(null, "Enter values for Quadratic equation c: ");
        cInput = Double.parseDouble(cReply);

        d = bInput * bInput - 4 * aInput * cInput;

        if (d < 0) {
            equation0utput.append("That quadratic does not have any solutions");
        } else if (d == 0) {
            equation0utput.append("That quadratic has one solution   =").append(-(bInput / 2 * aInput));
        } else {
            equation0utput.append("That quadratic has two solutions  1=").append(equationFormat.format(((-bInput) + Math.sqrt(d)) / (2 * aInput))).append(" and  2   =  ").append(equationFormat.format(((-bInput) - Math.sqrt(d)) / (2 * aInput)));
        }
        JOptionPane.showMessageDialog(null, equation0utput);
    }
}
