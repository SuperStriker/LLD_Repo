package transport;



import human.Employee;
import human.Person;

public class Car {

    public String color;
    public int regno;
    public String ownername;

    public Car(Car c1){

     this.color = c1.color;
     this.regno = c1.regno;
     this.ownername = c1.ownername;

    }
    
    
    public Car(String color, int regno, String ownername) {
        this.color = color;
        this.regno = regno;
        this.ownername = ownername;
    }


    public static void main(String[] args) throws Exception {
        System.out.println("hello transport car");

        
    }
}
