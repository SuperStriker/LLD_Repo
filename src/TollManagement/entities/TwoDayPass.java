package TollManagement.entities;

import TollManagement.configs.*;

public class TwoDayPass extends Pass{
    
    public TwoDayPass(){

    }

    public TwoDayPass(Vehicle vehicle, TollBooth tbooth, Toll toll1){
        super(vehicle,tbooth,toll1);
        this.test = "ga";
        
    }

}
