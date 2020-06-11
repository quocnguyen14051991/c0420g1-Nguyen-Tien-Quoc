package introductionToJava.abstractvainterface.baitaptrienkhaiinterfacecolorable;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] arr=new Shape[3];
        arr[0]=new Circle(3);
        arr[1]=new Square(3,"red",false);
        arr[2]=new Rectangle(3,6);
        for (Shape shape :arr) {
            if(shape instanceof Circle){
                System.out.println("Area Circle=" +" "+((Circle) shape).getArea());
            }else if(shape instanceof Square){
                System.out.println("Area Square="+" "+ ((Square) shape).getArea());
                ((Square) shape).howToColor();
            }
            else {
                System.out.println("Area Rectangle="+" "+ ((Rectangle) shape).getArea());
            }
        }
    }
}
