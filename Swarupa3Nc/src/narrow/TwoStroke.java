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
public class TwoStroke extends Engine{
    private final  double length;
    private final static double n=1;
    private final static double mr=29;

    public TwoStroke(double length, double power, double acc, double rpm, double HP) {
        super(power, acc, rpm, HP);
        this.length = length;
    }
    
    

    
    public double getLength() {
        return length;
    }
    
    public double brakeMeanPressure() {
       double meanPressure= (super.getHP() *6500)/(length/super.getRpm());
       return meanPressure;
       
    }
    
 
    public double intakeAir() {
        double intakeairmass = (mr*n)/super.getRpm();
       
       return intakeairmass;
    }

    

    @Override
    public String toString() {
        return  "length: " + length
                +"\nbreak mean pressure: "+brakeMeanPressure()+
                "\nintake air: "+intakeAir();
    }


    
}

    

