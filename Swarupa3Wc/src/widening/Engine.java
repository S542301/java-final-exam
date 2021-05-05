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
public class Engine {
    private final double power;
    private final double acc;
    private final double rpm;
    private final double HP;

    public Engine(double power, double acc, double rpm, double HP) {
        this.power = power;
        this.acc = acc;
        this.rpm = rpm;
        this.HP = HP;
    }

    
    public double getPower() {
        return power;
    }

    public double getAcc() {
        return acc;
    }

    public double getRpm() {
        return rpm;
    }

    public double getHP() {
        return HP;
    }

    
    @Override
    public String toString() {
        return  "power of engine : " + power + 
                "\naccelaration of engine: " + acc;
                
    }

}
