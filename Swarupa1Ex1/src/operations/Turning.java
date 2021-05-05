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
public class Turning extends Lathe{
    private final double depth;
    private final double feedRate;
    private final double BD;
    private final double SD;
    private final double feedperRev;

    public Turning(double depth, double feedRate, double BD, double SD, double feedperRev, double horsePower, double lengthOfBed, double speed) {
        super(horsePower, lengthOfBed, speed);
        this.depth = depth;
        this.feedRate = feedRate;
        this.BD = BD;
        this.SD = SD;
        this.feedperRev = feedperRev;
    }

    public double getBD() {
        return BD;
    }

    public double getSD() {
        return SD;
    }

    public double getFeedperRev() {
        return feedperRev;
    }

   
    
    

    
    public double getDepth() {
        return depth;
    }

    public double getFeedRate() {
        return feedRate;
    }
    
    
    
    
    public double feedRate(){
        double feed = super.getSpeed() * feedperRev;
        return feedRate;
    }
    
    public double depthOfCut(){
        double depthOfCut = ((BD-SD)/2);
        return depthOfCut;
    }

   
    @Override
    public String toString() {
        return  "Turning { " + "depth: " + depth +
                "\n feedRate: " + feedRate +
                "\n big diameter: " + BD +
                "\n small diameter: " + SD +
                "\n feedperRev: " + feedperRev +
                "\n rate of feed: "+feedRate()+
                "\n depth of cut : "+depthOfCut() + " } ";
    } 
}
