package Calculation;

public class Calculator {
    
    private String owner;
    private Long phonenum;

    public Calculator(String owner, Long phone) {
        this.owner = owner;
        this.phonenum = phone;
    }
    public Calculator(){
        
    }

    public  int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        if(b == 0) return -1;
        return a/b;
    }
   
}

