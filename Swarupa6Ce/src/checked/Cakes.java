/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checked;

/**
 *
 * @author Swarupa Pedapalli
 */
public class Cakes {
    private String customerName;
    private String cakeName;

    public Cakes(String customerName, String cakeName) {
        this.customerName = customerName;
        this.cakeName = cakeName;
    }
    
    

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCakeName() {
        return cakeName;
    }

    public void setCakeName(String cakeName) {
        this.cakeName = cakeName;
    }

    @Override
    public String toString() {
        return  "customerName: " + customerName +"\n "+"cakeName: " + cakeName;
    }
    
    
    


    
}
