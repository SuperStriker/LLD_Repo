package TollManagement.entities;

import TollManagement.enums.Passtype;

public abstract class Pass {
    private Vehicle vehicle;
    private TollBooth tBooth;
    private Toll toll;
    private Passtype passtype;
    String test;

    public Pass(){

    }

   
    public Pass(Vehicle vehicle, TollBooth tBooth, Toll toll, Passtype passtype) {
        this.vehicle = vehicle;
        this.tBooth = tBooth;
        this.toll = toll;
        this.passtype = passtype ;
    }

}
