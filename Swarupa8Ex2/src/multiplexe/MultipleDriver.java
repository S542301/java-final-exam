/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplexe;

import java.util.Scanner;

/**
 *
 * @author S542301
 */
public class MultipleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Swarupa Pedapalli");
        try {
            Scanner s1 = new Scanner(System.in);
           
            System.out.println("Enter  value1");
            int val1 = s1.nextInt();
            System.out.println("Enter value2");
            int val2 = s1.nextInt();
            method(val1, val2);
        } catch (ArithmeticException | NumberFormatException a) {
            System.out.println(a);
        }

    }

    private static void method(int valuex, int valuey) throws ArithmeticException, NumberFormatException {
        if (valuey == 0) {
            throw new ArithmeticException("Arithmetic Exception");
        }
        valuex = Integer.parseInt(null);
        throw new NumberFormatException("NumberFormat Exception");
    }
}
    
