package Calculation;

class ScientificCalculator extends Calculator {
    
    public ScientificCalculator(){
        super();
        System.out.println("hello world");


    }

    public ScientificCalculator(String name, String phone){

    }

    public int power(int a, int b){
        return (int) Math.pow(a,b);
    }
    public int floor(double a){
        return (int)Math.floor(a);
    }

    @Override
    public int add(int a , int b){
        // return a+b+5;
        int res = super.add(a,b);
        return res+10;
    }
    
}
