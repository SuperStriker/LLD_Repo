package Calculation;

public class Main {
    
   
    public static void main(String[] args){
        Calculator calc = new Calculator("Anoop",423L);
        int result = calc.add(2,3);
        System.out.println("res :" + result);
        // int pow = cal.power(7,8);
        ScientificCalculator scical = new ScientificCalculator();
        result = scical.add(5,6);
        System.out.println("res :" + result);
        int pow1 = scical.power(7,8);
        int add1 = scical.add(2,3);
        HighEndCalculator hec  = new HighEndCalculator("daf", "fasf");
        System.out.println("pow1 :" + pow1 + " add1 :" + add1);
        int hecr = hec.power(4,5);
        System.out.println("hecr :" + hecr );
        scical.power(6,7);

        Type2calculator type2 = new Type2calculator();
        result = type2.add(5,6);

        Calculator scical_cal = new ScientificCalculator();
        int scal_cal = scical_cal.add(4, 5);  // this calls the scientific calculator add function

         System.out.println("sci_cal calc:" + scal_cal );
    }
    
}
