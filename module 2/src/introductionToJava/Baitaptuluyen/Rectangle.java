package introductionToJava.Baitaptuluyen;

public class Rectangle extends Geometric {
    private double width;
    private double height;
    Rectangle(){
    }
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public Rectangle(String color,String filled,double width,double height){
//        this.setColor(color);
//        this.setFilled(filled);
        super(color,filled);
        this.width=width;
        this.height=height;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Circle circle=new Circle(1);
        circle.setFilled("black");
        System.out.println("A cricle"+circle.toString());
        System.out.println("the radius="+circle.getRadius());
        System.out.println("The area is"+circle.getArea());
        System.out.println("The diameter:"+circle.getDiameter());
        Rectangle rectangle=new Rectangle(2,4);
        System.out.println("A rectangle"+rectangle.toString());
        System.out.println("the area"+rectangle.getArea());
        System.out.println("the perimeter"+rectangle.getPerimeter());
        System.out.println();


    }
}
