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
public abstract class Lathe {
    private final double horsePower;
    private final double lengthOfBed ;
    private final double speed;

    public Lathe(double horsePower, double lengthOfBed, double speed) {
        this.horsePower = horsePower;
        this.lengthOfBed = lengthOfBed;
        this.speed = speed;
    }
    

   

    public double getHorsePower() {
        return horsePower;
    }

    public double getLengthOfBed() {
        return lengthOfBed;
        
    }

    public double getSpeed() {
        return speed;
    }
    

    

    @Override
    public String toString() {
        return  "horsePower of machine: " + horsePower+ 
                "\nlength  of bed: " + lengthOfBed+
                "\nspeed : " + speed ;
    }


    
    
    

    
}
