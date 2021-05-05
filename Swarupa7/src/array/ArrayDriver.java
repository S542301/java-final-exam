/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Swarupa Pedapalli
 */
public class ArrayDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       

	System.out.println("Swarupa Pedapalli");
		Random rand=new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt();
	}
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter the index of the array: ");
        int index=s1.nextInt();
        if(index<100)
            System.out.println("Corresponding element value at this "+index+" is: "+array[index]);
        else
            System.out.println("Out of bounds");
        
    }
    
}

    