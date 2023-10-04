package TollManagement.entities;

import TollManagement.configs.*;
import TollManagement.enums.Passtype;

public class TwoDayPass extends Pass{
    
    public TwoDayPass(){

    }

    public TwoDayPass(Vehicle vehicle, TollBooth tbooth, Toll toll1,Passtype passtype){
        super(vehicle,tbooth,toll1,passtype);
        this.test = "ga";
        
    }

}
