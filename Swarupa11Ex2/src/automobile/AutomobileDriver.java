/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobile;

/**
 *
 * @author Swarupa Pedapalli
 */
public class AutomobileDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Swarupa Pedapalli");
        Vehicle s1 = new Vehicle("Audi",78.5,242.7);
        Vehicle s2 = new Vehicle("Audi", 78.5,242.7);
          
        
        if(s1.hashCode() == s2.hashCode())
        {
  
            if(s1.equals(s2))
                System.out.println("The two objects are equal ");
            else
                System.out.println("The two Objects are not equal. ");
      
        }
        else
        System.out.println("The two Objects are not equal. "); 
    } 
}
    
    


   
