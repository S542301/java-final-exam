/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package industrial;

/**
 *
 * @author Swarupa Pedapalli
 */
public class IndustrialDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Swarupa Pedapalli");
        
        Industry d1=new Industry("reliance","bombay",1969);
        Industry d2=new Industry("reliance","bombay",1969);
        Industry d3=new Industry("steelplant","vizag",1939);
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        System.out.println("***********************************");
        System.out.println("Equals: ");
        System.out.println(d1.equals(d3));
        System.out.println(d1.equals(d2));
        System.out.println(d2.equals(d3));
        
        System.out.println("*************************************");
                System.out.println(d1==(d3));
                System.out.println(d1==(d2));
                System.out.println(d2==(d3));
                System.out.println("***********************************");
        System.out.println("Hash code: ");
               // System.out.println("***********************************");
                System.out.println(d1.hashCode());
                System.out.println(d2.hashCode());
                System.out.println(d3.hashCode());
                
              

    }
    
}

   