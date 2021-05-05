/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import java.util.Scanner;

/**
 *
 * @author Swarupa Pedapalli
 */
public class ComponentsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Swarupa Pedapalli");
        Scanner s1= new Scanner(System.in);
        System.out.print("Enter the module: ");
        int module= s1.nextInt();
        System.out.print("Enter the outerDia: ");
        double outerDia=s1.nextDouble();
        System.out.print("Enter the innerDia: ");
        double innerDia=s1.nextDouble();
        
        Gear s2 = new Gear (module,  outerDia,  innerDia);
        System.out.print("The gearratio is: ");
        System.out.println(s2.gearratio(240,56));
        System.out.print("The pitch is: ");
        System.out.println(s2.pitch());
        System.out.print("The diameteral pitch is: ");
        System.out.println(s2.diaPitch(12));
        System.out.print("The centre ditance is: ");
        System.out.println(s2.centreDistance());
        
        

    }
    
}
