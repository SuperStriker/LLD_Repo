package human;

public class Person {

protected String name;
protected int aadhar;
int ssn;
protected double bank_balance;
public String address;




public String getName() {
    return name;
}
public int getId() {
    return aadhar;
}
public void setName(String name) {
    this.name = name;
}
public void setId(int aadhar) {
    this.aadhar = aadhar;
}
public Person(){

}
public static void main(String[] args){
        System.out.println("employee main");
        Employee e = new Employee();


    }
    
}
