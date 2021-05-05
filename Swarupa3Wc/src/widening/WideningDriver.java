/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package widening;

/**
 *
 * @author Swarupa Pedapalli
 */
public class WideningDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Swarupa Pedapalli");
        
        int len=56;
        int crankShaftSpeed=14;
        
        float rpm=crankShaftSpeed;
        double HP=rpm;
        double power=HP;
        float acc=len;
       
       
       Engine s1=new FourStroke(len, crankShaftSpeed, power,acc,rpm,HP );
        System.out.println(s1.toString());
        
        
        
    }
    
}

    
