/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compare;

/**
 *
 * @author Swarupa Pedapalli
 */
public class CompareDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Swarupa Pedapalli");
        ComparableCircle S1 = new ComparableCircle(42.86);

        ComparableCircle S2 = new ComparableCircle(32.76);
       

        System.out.println("Larger instance: " + findLargest(S1, S2));
    }

    private static String findLargest(ComparableCircle S3, ComparableCircle S4) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String S = " ";
        if (S3.compareTo(S4) > 0) {
            S = "The first circle area is large.";
        } else if (S3.compareTo(S4) < 0) {
            S = "The second circle area is large.";
        } else {
            S = "Both the areas are equal";
        }

        return S;
    }

}

   
