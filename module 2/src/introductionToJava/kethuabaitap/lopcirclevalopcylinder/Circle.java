package introductionToJava.kethuabaitap.lopcirclevalopcylinder;

public class Circle {
    public static final double  PI=3.14255;
    double radius;
    String color;
    Circle(){

    }
    Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public double getArea(){

        return PI*Math.pow(this.radius,2);
    }

    @Override
    public String toString() {
        return "This is a class Circle have radius="+this.radius;
    }
}
