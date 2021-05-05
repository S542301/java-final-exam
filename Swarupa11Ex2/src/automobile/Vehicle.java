/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobile;

import java.util.Objects;

/**
 *
 * @author Swarupa Pedapalli
 */
public class Vehicle {
    private String Name;
    private double mileage;
    private double fuelrate;

    public Vehicle(String Name, double mileage, double fuelrate) {
        this.Name = Name;
        this.mileage = mileage;
        this.fuelrate = fuelrate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuelrate() {
        return fuelrate;
    }

    public void setFuelrate(double fuelrate) {
        this.fuelrate = fuelrate;
    }

    @Override
    public int hashCode() {
        int hash = 9;
        hash = 54 * hash + Objects.hashCode(this.Name);
        hash = 54 * hash + (int) (Double.doubleToLongBits(this.mileage) ^ (Double.doubleToLongBits(this.mileage) >>> 32));
        hash = 54 * hash + (int) (Double.doubleToLongBits(this.fuelrate) ^ (Double.doubleToLongBits(this.fuelrate) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object s1) {
        if (this == s1) {
            return true;
        }
        if (s1 == null) {
            return false;
        }
        if (getClass() != s1.getClass()) {
            return false;
        }
        final Vehicle other = (Vehicle) s1;
        if (Double.doubleToLongBits(this.mileage) != Double.doubleToLongBits(other.mileage)) {
            return false;
        }
        if (Double.doubleToLongBits(this.fuelrate) != Double.doubleToLongBits(other.fuelrate)) {
            return false;
        }
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Name: " + Name + "\nmileage: " + mileage + "\nfuelrate: " + fuelrate;
    }
    
    
    
    
}

    

