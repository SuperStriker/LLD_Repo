package general;

import human.Employee;

public class Employee1 extends Employee {
    
    public Employee1(){
        System.out.println("emp1 constructor");
    }

    public double calc_social_rating(double salary,double bank_balance){
    return (salary*20 + bank_balance)/100;
    }

    public static void main(String[] args){

    Person1 p1 = new Person1();
    p1.address = "Fort Collins";
    p1.social_rating = 6896l;

    Employee1 emp1 = new Employee1();
    emp1.salary = 10000;
    emp1.bank_balance = 5000000;
    System.out.println(emp1.calc_social_rating(emp1.salary,emp1.bank_balance));
    
    
    }


}


