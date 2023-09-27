package Abstraction.shape;

 
public class Triangle extends Shape {
    
    private final double width, height;

    public Triangle(){
        this(1,1);
    }
    public Triangle(double width, double height){
        this.width  = width;
        this.height = height;
    }

    public double getwidth(){
        return width;
    }
    public double getlength(){
        return height;
    }
    
    @Override
    public double CalculateArea(){
        return (width * height)/2;
    }
    @Override
    public double CalculateCircumference(){
        return width + height + Math.sqrt((width*width) + (height*height));
    }


}
