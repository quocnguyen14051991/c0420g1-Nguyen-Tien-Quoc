package introductionToJava.kethuabaitap.lopcirclevalopcylinder;

public class Cylinder extends Circle {
    double height;

    public Cylinder(double height) {
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public Cylinder(){

    }
    public double getAreaCylinder(){
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "this is a Class Cylinder hava height="+this.height+ "is subclass frome"+super.toString();
    }
}
