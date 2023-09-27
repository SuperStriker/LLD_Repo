package Abstraction.shape;

public class Circle extends Shape{
    private final double radius;
    final double pi = Math.PI;

    public Circle(){
        this(1);
    }
    public Circle(double radius){
        this.radius = radius;
    }


    public double getRadius(){
        return radius;
    }

    @Override
    public double CalculateArea(){
        return pi*Math.pow(radius,2);
    }
    @Override
    public double CalculateCircumference(){
        return 2*pi*radius;
    }

}
