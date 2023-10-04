package TollManagement.configs;

import TollManagement.entities.Vehicle;
import TollManagement.entities.Toll;
import TollManagement.entities.TollBooth;
import TollManagement.enums.Passtype;

public abstract class Pass1 {
    private Vehicle vehicle;
    private TollBooth tBooth;
    private Toll toll;
    private Passtype passtype;
    protected String test;
    // String test;

    public Pass1(){

    }

    public Pass1(Vehicle vehicle, TollBooth tBooth, Toll toll, Passtype passtype) {
        this.vehicle = vehicle;
        this.tBooth = tBooth;
        this.toll = toll;
        this.passtype = passtype ;
    }

    public Pass1(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void testfun(){

    }

}
