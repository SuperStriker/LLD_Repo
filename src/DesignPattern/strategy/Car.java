package DesignPattern.strategy;

public class Car implements Vehicle{

    @Override
    public void moveForward() {
        // TODO Auto-generated method stub
        System.out.println("car forward");
        
    }

    @Override
    public void movebackward() {
        // TODO Auto-generated method stub
        System.out.println("car backward");
        
    }

    @Override
    public void moveleft() {
        // TODO Auto-generated method stub
        System.out.println("car left");
        
    }

    @Override
    public void moveright() {
        // TODO Auto-generated method stub
        System.out.println("car right");
        
    }
    
}
