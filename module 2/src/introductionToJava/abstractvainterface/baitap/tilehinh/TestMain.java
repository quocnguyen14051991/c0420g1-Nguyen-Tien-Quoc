package introductionToJava.abstractvainterface.baitap.tilehinh;

public class TestMain {
    public static void main(String[] args) {
        Shape[] arr=new Shape[3];
        arr[0]=new Circle(3.5);
        arr[1]=new Rectangle(3,7,"red",false);
        arr[2]=new Square(3);
        System.out.println("Befor call interface Area :");
        for (Shape shap:arr
             ) {
            System.out.println(shap);

        }
        System.out.println();
        System.out.println("affter call interface Area:");
        double percent=(Math.round(Math.random()*99)+1);
        System.out.println(percent);
        for (Shape shape:arr
             ) {
            if(shape instanceof Circle){
                ((Circle) shape).resize(percent);
            }
            else if(shape instanceof Rectangle){
                ((Rectangle) shape).resize(percent);
            }else {
                ((Square) shape).resize(percent);
            }

        }
    }
}
