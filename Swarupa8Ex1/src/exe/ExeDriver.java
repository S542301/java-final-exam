/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe;

import java.util.Scanner;

/**
 *
 * @author Swarupa Pedapalli
 */
public class ExeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NumberFormatException{
 {
        // TODO code application logic here
        System.out.println("Swarupa Pedapalli");
           
        try{
        Scanner s1=new Scanner(System.in);
        
        System.out.println("Enter the value");
        
        String str=s1.next();
        int s;
        s = Integer.parseInt(str);
        }catch(NumberFormatException e){
            System.out.println("Throws the number format exception");
        }
    }
    }
}


        
    
