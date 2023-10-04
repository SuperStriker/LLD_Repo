package DesignPattern.strategy;

public class Bus implements Vehicle{

    @Override
    public void moveForward() {
        // TODO Auto-generated method stub
        System.out.println("bus forward");
        
    }

    @Override
    public void movebackward() {
        // TODO Auto-generated method stub
        System.out.println("bus backward");
        
    }

    @Override
    public void moveleft() {
        // TODO Auto-generated method stub
        System.out.println("bus left");
        
    }

    @Override
    public void moveright() {
        // TODO Auto-generated method stub
        System.out.println("bus right");
    
}

}
