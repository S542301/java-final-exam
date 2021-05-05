/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author Swarupa Pedapalli
 */
public class ShapesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Swarupa Pedapalli");
        GeometricObject[] s1 = new Square[5];
		GeometricObject s2 = new Square(21);
		GeometricObject s3 = new Square(27);
		GeometricObject s4 = new Square(32);
		GeometricObject s5 = new Square(14);
		GeometricObject s6 = new Square(7);
		s1[0] = s2;
                s1[1] = s3;
                s1[2] = s4;
                s1[3] = s5;
                s1[4] = s6;
               
                 for (GeometricObject S : s1) {
                     
                     System.out.println("Area of the object is: "+S.area());
            if (S instanceof Colorable) {
                Colorable s7 = (Colorable) S;
                s7.howToColor();
            }
            
        }
    }
}
