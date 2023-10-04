package TollManagement.entities;

import TollManagement.enums.VehicleType;

public class FourWheeler extends Vehicle {
    
    public FourWheeler(final String regnumber,final String ownername, final VehicleType vehicleType){
        super(regnumber,ownername,vehicleType);
    }

}
