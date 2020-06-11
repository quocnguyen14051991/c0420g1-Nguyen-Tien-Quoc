package introductionToJava.kethuathuchanh;

public class Circle extends Shape{
    public static final double PI=3.14222;
    private double radius=1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean value, double radius) {
        super(color, value);
        this.radius = radius;
    }

    public Circle() {
    }

    public Circle(String color, boolean value) {
        super(color, value);
    }
    public double getArea(double radius){
        return PI*Math.pow(this.radius,2);
    }
    public double getPerimeter(double radius){
        return PI*2*this.radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius="+this.radius+" which is a subclass of"+super.toString();
    }
}
