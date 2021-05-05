/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checked;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Swarupa Pedapalli
 */
public class CheckedDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        System.out.println("Swarupa Pedapalli");
        Scanner s1 = new Scanner(new File("input.txt"));
        
        int quantity=s1.nextInt();
        double costOfEachCake=s1.nextDouble();
        String customerName=s1.next();
        String cakeName=s1.next();
        Pastry s2=new Pastry( quantity,costOfEachCake,customerName,cakeName);   
        System.out.println(s2.toString());
       
        
        
        
    }
    
}


    
