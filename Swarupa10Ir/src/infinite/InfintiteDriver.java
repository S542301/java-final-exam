/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infinite;

import java.util.Scanner;

/**
 *
 * @author Swarupa Pedapalli
 */
public class InfintiteDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Swarupa Pedapalli");
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter the value1: ");
        double value1=s1.nextDouble();
        System.out.print("Enter the value2: ");
        double value2=s1.nextDouble();


        try{
        InRecursion s2=new InRecursion(value1,value2);
        
        System.out.println(s2.toString());
        System.out.println(s2.series(7));
        }
        catch(StackOverflowError a){
            System.out.println("infinite recursion happened");
        }
    
}
}

    
    

