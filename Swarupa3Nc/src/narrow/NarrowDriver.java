/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package narrow;

/**
 *
 * @author Swarupa Pedapalli
 */
public class NarrowDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Swarupa Pedapalli");
        double length=7.98;
        double rpm=20.45;
       long power=(long) length;
       int HP=(int) power;
       long acc=(long) HP;

        
        
        
        
        Engine s2=new TwoStroke( length, power,acc,rpm,HP);
        System.out.println(s2.toString());
        
    }
    
}
