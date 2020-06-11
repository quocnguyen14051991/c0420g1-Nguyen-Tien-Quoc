package introductionToJava.kethuathuchanh;

public class SquareTest {
    public static void main(String[] args) {
//        Object x=new Circle()
//        Shape shape=new Circle();
//        Circle x=(Circle)shape;
//        x.setColor("red");
//        System.out.println(shape.getColor());

        Square square =new Square();
        System.out.println(square);
        Square square1=new Square(3.25);
        System.out.println(square1);
        Square square2=new Square("bulue",true,3.15);
        System.out.println(square2);
    }
}
