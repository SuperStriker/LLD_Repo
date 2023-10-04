package DesignPattern.strategy;

public class VehicleFactory {
    
    public VehicleFactory(){

    }

    public static Vehicle getStrategy(String strategyString){
        if (strategyString.toLowerCase().equals("car")){
            return new Car();
        }else if (strategyString.toLowerCase().equals("bus")){
            return new Bus();
        }
        else if (strategyString.toLowerCase().equals("bicycle")){
            return new Bicycle();
        }

        return null;
    }





}
