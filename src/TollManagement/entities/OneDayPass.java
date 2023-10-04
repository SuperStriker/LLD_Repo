package TollManagement.entities;

import TollManagement.enums.Passtype;
import TollManagement.configs.Pass1;

public class OneDayPass extends Pass1{
    public OneDayPass(final Vehicle vehicle, final TollBooth booth, final Toll toll, final Passtype passType) {
        super(vehicle,booth,toll,passType);
        this.testfun();
        this.testAbc(vehicle);
        this.test = "dfa";
    }
    public OneDayPass(){
    }

    void testAbc(Vehicle vehicle) {

    }
}
