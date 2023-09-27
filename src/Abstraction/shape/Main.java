package Abstraction.shape;

public class Main {


    public static void main(String[] args){
    
        Shape cir = new Circle(6);
        System.out.println(cir.CalculateArea());
        System.out.println(cir.CalculateCircumference());

        Shape  rect  = new Rectangle(6,5);
        System.out.println(rect.CalculateArea());
        System.out.println(rect.CalculateCircumference());

        Shape tri = new Triangle(6,2);
        System.out.println(tri.CalculateArea());
        System.out.println(tri.CalculateCircumference());


        Shape sha = new Shape();
        

    }
    
}
