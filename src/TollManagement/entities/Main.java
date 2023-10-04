package TollManagement.entities;


public class Main {
    
    public static void main(String [] args){
    
    Vehicle vehicle = new TwoWheeler(null, null, null) ;
    TollBooth tb = new TollBooth();
    Toll tl = new Toll();
    vehicle.setOwnerName("test");
    TwoDayPass tdp = new TwoDayPass(vehicle,tb,tl, null);


    }
  

}
