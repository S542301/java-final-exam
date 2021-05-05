/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infinite;

/**
 *
 * @author Swarupa Pedapalli
 */
public class InRecursion {
    
    
    private double value1;
    private double value2;

    public InRecursion(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public double series(int n){
        if(value1==0||value2==0){
            return 0;
        }
            else
            return Math.pow(value1*value2,value1+value2)+series(n);
        
    }

    @Override
    public String toString() {
        return "value1: " + value1 + "\nvalue2: " + value2 ;
    }
    
    
    }
    
        
    

 
