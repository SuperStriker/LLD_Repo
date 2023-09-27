package Abstraction.shape;


public class Rectangle extends Shape {
    
    private final double width, length;

    public Rectangle(){
        this(1,1);
    }
    public Rectangle(double width, double length){
        this.width  = width;
        this.length = length;
    }

    public double getwidth(){
        return width;
    }
    public double getlength(){
        return length;
    }
    
    @Override
    public double CalculateArea(){
        return width * length;
    }
    @Override
    public double CalculateCircumference(){
        return 2*(width + length);
    }


}
