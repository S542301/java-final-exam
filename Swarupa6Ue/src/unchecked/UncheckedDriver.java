/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unchecked;

/**
 *
 * @author Swarupa Pedapalli
 */
public class UncheckedDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Swarupa Pedapalli");
        try{
            int number1=43;
            int number2=0;
         
         
         
            Numbers s1=new Numbers(number1,number2);
        
            System.out.println(s1.toString());
            System.out.println("Division: "+s1.division());
            
           
           
        }catch(ArithmeticException ae){
            System.out.println("division by number 0 is undefined");
            System.out.println("throws arthimetic exception: cannot divide by zero");
           
        }
        
        
    }

    }
    

