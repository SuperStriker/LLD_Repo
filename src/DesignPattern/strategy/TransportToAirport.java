package DesignPattern.strategy;


public class TransportToAirport{

    private Vehicle vehicle;

    public TransportToAirport(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public TransportToAirport(){
       
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
 
    public void travelToDestination(){
        // This method will have logic of how to use vehicle's methods to
       // travel to destination.
        if(vehicle == null) {
            System.out.println("Please choose the strategy");
            return;
        }

        vehicle.moveForward();

        vehicle.moveright();

        vehicle.moveleft();
    }

    public void getvehicle(){
        System.out.println("vehicle string:" + this.vehicle.toString() );
    }



}