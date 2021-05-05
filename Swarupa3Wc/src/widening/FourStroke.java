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
public class FourStroke extends Engine {
    private final double len;
    private final double crankShaftSpeed;
    private final static double x=0.166;
    private final static double N=2;
    private final static double mair=29;

    public FourStroke(double len, double crankShaftSpeed, double power, double acc, double rpm, double HP) {
        super(power, acc, rpm, HP);
        this.len = len;
        this.crankShaftSpeed = crankShaftSpeed;
    }

    

    public double getLen() {
        return len;
    }

   
    public double getCrankShaftSpeed() {
        return crankShaftSpeed;
    }
    
  
    public double brakeMeanPressure() {
       double meanPressure= (super.getHP()*13000)/(len/super.getRpm());
       return meanPressure;
       
       
       
    }
      
      
    public double intakeAir() {
        double intakeairmass = (mair*N)/super.getRpm();
       
       return intakeairmass;
    }
    
   

   
    @Override
    public String toString() {
        return  "length: " + len + 
                "\ncrankshaftSpeed: " + crankShaftSpeed + 
                "\nbreak mean pressure: "+brakeMeanPressure()+
                "\nintakeair: "+intakeAir();
                
    }

    
}
    

