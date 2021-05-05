/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

/**
 *
 * @author Swarupa Pedapalli
 */
public class Threading  extends Lathe{
    private final double pitch;
    private final  double singleDepth;
    private final double BD;
    
    private final static double infeedDepth=0.75;

    public Threading(double pitch, double singleDepth, double BD, double horsePower, double lengthOfBed, double speed) {
        super(horsePower, lengthOfBed, speed);
        this.pitch = pitch;
        this.singleDepth = singleDepth;
        this.BD = BD;
    }

  

   

    public double getPitch() {
        return pitch;
    }

    public double getSingleDepth() {
        return singleDepth;
    }

  
     public double singleDepth(){
        double singleDepth = pitch * infeedDepth;
        return singleDepth;
    }
 
    
    public double cuttingSpeed(){
        double cuttingSpeed = 180* super.getSpeed()/1000;
        return cuttingSpeed;
    }

   @Override
    public String toString() {
        return  "Threading { " + "pitch: " + pitch +
                "\n singleDepth: " + singleDepth +
                "\n big diameter: " + BD +
               
               
                "\n singleDepth: "+singleDepth()+
                "\n cuttingSpeed : "+cuttingSpeed() +  "  }";
    } 
    
}
