/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

/**
 *
 * @author Swarupa Pedapalli
 */
public class SquareRoot {
    
    private double num;

    public SquareRoot(int num) {
        this.num = num;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }
    
    public String squarerroot(){
        String str=" ";
        if(Math.sqrt(num) <0) {
            throw new ArithmeticException("complex value");
        }
        else{
           str="value is real ";
        }
        return str;
    }

    @Override
    public String toString() {
        return "num: " + num ;
    }

            
        }
        
    
            
    

