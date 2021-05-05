/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathrow;

/**
 *
 * @author Swarupa Pedapalli
 */
public class Vehicle {
    
    private double outputSpeed;
    private double inputSpeed;

    public Vehicle(double outputSpeed, double inputSpeed) {
        this.outputSpeed = outputSpeed;
        this.inputSpeed = inputSpeed;
    }

    public double getOutputSpeed() {
        return outputSpeed;
    }

    public void setOutputSpeed(double outputSpeed) {
        this.outputSpeed = outputSpeed;
    }

    public double getInputSpeed() {
        return inputSpeed;
    }

    public void setInputSpeed(double inputSpeed) {
        this.inputSpeed = inputSpeed;
    }
    
    
    public double gearRatio(){
        return (outputSpeed/inputSpeed);
    }
    @Override
    public String toString() {
        return "outputSpeed: " + outputSpeed + "\ninputSpeed: " + inputSpeed+"\ngearRatio: "+gearRatio();
    }
    
    
    
}

    

