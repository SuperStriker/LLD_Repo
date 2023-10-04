package DesignPattern.strategy;

public class Main {
    public static void main(String[] args){

        Vehicle vehicle = new Car(); // strategy
        TransportToAirport toAirport = new TransportToAirport();
        toAirport.setVehicle(vehicle);
        toAirport.travelToDestination();


        Vehicle vehicle1 = new Bus(); // strategy
        TransportToAirport toAirport1 = new TransportToAirport();
        toAirport1.setVehicle(vehicle1);
        toAirport1.travelToDestination();



        Vehicle vehicle3 = VehicleFactory.getStrategy("CAR");
        TransportToAirport toAirport2 = new TransportToAirport();
        toAirport2.setVehicle(vehicle3);
        toAirport2.travelToDestination();
        toAirport2.getvehicle();
        // 2nd day
        Vehicle vehicle4 = VehicleFactory.getStrategy("bicycle");
        toAirport2.setVehicle(vehicle4);
        toAirport2.travelToDestination();
        

    }
}
