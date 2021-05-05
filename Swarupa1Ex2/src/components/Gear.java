/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

/**
 *
 * @author Swarupa Pedapalli
 */
public class Gear implements Helical, Worm{
    private double module;
    private double outerDia;
    private double innerDia;

    public Gear(double module, double outerDia, double innerDia) {
        this.module = module;
        this.outerDia = outerDia;
        this.innerDia = innerDia;
    }

    public double getModule() {
        return module;
    }

    public double getOuterDia() {
        return outerDia;
    }

    public double getInnerDia() {
        return innerDia;
    }
    
    
    
    @Override
    public double gearratio(int outputSpeed, int inputSpeed){
        double gearratio = outputSpeed/inputSpeed;
        return gearratio;
        
        
    }
    
    @Override
    public double pitch(){
        double pitch = module * 4;
        return pitch;
    }
   
    @Override
    public double diaPitch( int numOfTeeth){
        double diaPitch= numOfTeeth*outerDia;
        return diaPitch;
    }
    
    
    @Override
    public double centreDistance(){
        double centreDistance= outerDia+innerDia;
        return centreDistance;
    }
}

