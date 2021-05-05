/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package industrial;

import java.util.Objects;

/**
 *
 * @author Swarupa Pedapalli
 */
public class Industry {
    
    private String name;
    private String address;
    private int establishedyear;

    public Industry(String name, String address, int establishedyear) {
        this.name = name;
        this.address = address;
        this.establishedyear = establishedyear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEstablishedyear() {
        return establishedyear;
    }

    public void setEstablishedyear(int establishedyear) {
        this.establishedyear = establishedyear;
    }

    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + Objects.hashCode(this.address);
        hash = 31 * hash + this.establishedyear;
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
        final Industry other = (Industry) s1;
        if (this.establishedyear != other.establishedyear) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "name: " + name + "\naddress: " + address +"\nestablishedyear: " + establishedyear;
    }

    
  
    
    
}

    

