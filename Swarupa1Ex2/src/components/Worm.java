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
public interface Worm {
     double centreDistance();
    
    
    default double diaPitch( int numOfTeeth){
        double circularPitch=3.14/numOfTeeth;
        return circularPitch;
        
    }


    
}

    

