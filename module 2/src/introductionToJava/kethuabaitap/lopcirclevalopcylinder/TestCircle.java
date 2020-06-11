package introductionToJava.kethuabaitap.lopcirclevalopcylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Cylinder(3.14, "fdf",3);
        System.out.println( circle1.toString());
        Cylinder cylinder1 = (Cylinder) circle1;
        System.out.println("height="+cylinder1.getHeight());
        System.out.println("Area="+cylinder1.getAreaCylinder());
    }
}
