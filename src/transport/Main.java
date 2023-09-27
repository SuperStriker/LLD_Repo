package transport;

public class Main {
    
    public static void main(String[] args){
        Car reapercar = new Car("black",1345,"Lolan");

        Car reapercarcopy = new Car(reapercar);
        System.out.println(reapercarcopy.ownername);
        

    }
}
