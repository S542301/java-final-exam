/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathrow;

import java.util.ArrayList;

/**
 *
 * @author Swarupa Pedapalli
 */
public class VehicleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        // TODO code application logic here
        System.out.println("Swarupa Pedapalli");
        
        ArrayList<Object> s1 = new ArrayList<Object>();
        try{
        s1.add(new Vehicle(9.9 , 3.6 ));
        s1.add(7);
        s1.add(13);
        System.out.println(s1.get(0));
        System.out.println(s1.get(4));
        System.out.println(s1.get(9));



        
    }catch(Exception e){
            System.out.println("accessing  array element with an illegal index");
            System.out.println("Throws ArrayIndexOutOfBoundsException");
    }
    

    }
    
}
