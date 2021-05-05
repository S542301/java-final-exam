/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import java.util.Scanner;

/**
 *
 * @author Swarupa Pedapalli
 */
public class OperationsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Swarupa Pedapalli");
        
        Scanner s1= new Scanner(System.in);
        System.out.print("Enter the horsePower of machine: ");  
        double horsePower=s1.nextDouble();
        
        System.out.print("Enter the lengthOfBed: ");  
        double lengthOfBed=s1.nextDouble();
        
        System.out.print("Enter the speed : ");  
        double speed=s1.nextDouble();
        
        System.out.print("Enter the pitch: ");  
        double pitch=s1.nextDouble();
        
        System.out.print("Enter the singleDepth: ");  
        double singleDepth=s1.nextDouble();
        
        System.out.print("Enter the depth: ");  
        double depth=s1.nextDouble();
        
        System.out.print("Enter the feedRate: ");  
        double feedRate=s1.nextDouble();
        
        System.out.print("Enter the BD: ");  
        double BD=s1.nextDouble();
        
        System.out.print("Enter the SD: ");  
        double SD=s1.nextDouble();
        
        System.out.print("Enter the feedperRev: ");  
        double feedperRev=s1.nextDouble();
        
        
        
        Lathe s2=new Turning( horsePower,lengthOfBed,speed,depth,feedRate,BD,SD,feedperRev);
        System.out.println(s2.toString());
        
        Lathe s3 =new Threading(horsePower,lengthOfBed,speed,pitch,singleDepth,BD);
           System.out.println(s3.toString());
        



    }
    
}
