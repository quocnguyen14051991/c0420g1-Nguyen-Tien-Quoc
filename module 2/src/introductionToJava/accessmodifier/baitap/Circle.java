package introductionToJava.accessmodifier.baitap;

public class Circle {
    public static final double PI=3.14;
    private double  radius=0;
    private String color="red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
     protected double getRadius(){
        return this.radius;
    }
    protected double getArea(){
        return PI*this.radius;
}

}
