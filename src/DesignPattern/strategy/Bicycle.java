package DesignPattern.strategy;



public class Bicycle implements Vehicle{

    @Override
    public void moveForward() {
        // TODO Auto-generated method stub
        System.out.println("bicycle forward");
        
        
    }

    @Override
    public void movebackward() {
        // TODO Auto-generated method stub
        System.out.println("bicycle backward");
        
        
    }

    @Override
    public void moveleft() {
        // TODO Auto-generated method stub
         System.out.println("bicycle left");
        
    }

    @Override
    public void moveright() {
        // TODO Auto-generated method stub
         System.out.println("bicycle right");
        
    }
    
    
}
