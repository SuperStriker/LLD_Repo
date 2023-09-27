package TollManagement.entities;

import TollManagement.enums.VehicleType;

public abstract class Vehicle {
    
    private String regnumber;
    private String ownerName;
    private VehicleType vehicleType;  


     public Vehicle(){
        System.out.println("owner_name:" + this.ownerName);
     }


    public Vehicle(String regnumber, String ownerName, VehicleType vehicleType) {
        this.regnumber = regnumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }


    public String getOwnerName() {
        return ownerName;
    }


    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


    public VehicleType getVehicleType() {
        return vehicleType;
    }


    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }




}
