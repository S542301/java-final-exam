/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

import java.util.Scanner;

/**
 *
 * @author Swarupa Pedapalli
 */
public class MathDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Swarupa Pedapalli");
        
        try{
           
        Scanner s1=new Scanner(System.in);
            System.out.print("Enter the number: ");
        int num=s1.nextInt();
        SquareRoot c=new SquareRoot(num);
        System.out.println(c.toString());
        System.out.println(c.squarerroot());
       
    }catch(Exception a){
            System.out.println("throws arithmetic exception ");
    }
    
}
}
    
