package introductionToJava.Baitaptuluyen;

import introductionToJava.accessmodifier.baitap.Circle;

public class TestCircle extends Circle {
    public TestCircle() {
    }

    public TestCircle(double radius, String color) {
        super(radius, color);
    }

    public static void main(String[] args) {

       TestCircle testCircle=new TestCircle(3.144,"red");
        double txt=testCircle.getRadius();
        double area=testCircle.getArea();
        System.out.println(area);
        System.out.println(txt);

    }
}
