package general;
import human.Employee;
import human.Person;

public class Person1 extends Person {

 protected  double social_rating;

public Person1(){
// super();
System.out.println("child const");

}

public Person1(String name ){
// super();
this.name = name;
System.out.println("child const::"+ this.name);
}



public static void main(String[] args){

    Person1 p1 = new Person1("alvarez");
    p1.aadhar = 45145;
    
}




}
