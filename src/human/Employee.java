
package human;
import transport.Car;


public class Employee extends Person {
  
    
   protected double salary;
   protected double bank_balance;

    public Employee(){

    }
    
    
    

    public Employee(double salary,int aadhar) {
      this.salary = salary;
      this.aadhar = aadhar;


      Person p = new Person();
      p.aadhar = 12314;
   }




   void get_salary(){
       System.out.println("salary:"+ salary);
    }
    
    void get_name(){
       System.out.println("name:"+ name);
    }

     void get_id(){
       System.out.println("id:"+ aadhar);
    }
    

    
}