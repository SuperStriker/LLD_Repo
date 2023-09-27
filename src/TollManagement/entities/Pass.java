package TollManagement.entities;

public abstract class Pass {
    private Vehicle vehicle;
    private TollBooth tBooth;
    private Toll toll;
    protected String test;

    public Pass(){

    }

    public Pass(Vehicle vehicle, TollBooth tBooth, Toll toll) {
        this.vehicle = vehicle;
        this.tBooth = tBooth;
        this.toll = toll;
    }

}
