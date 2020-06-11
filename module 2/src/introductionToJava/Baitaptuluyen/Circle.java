package introductionToJava.Baitaptuluyen;

public class Circle extends Geometric {
    private double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius,String color,String filled){
        this.radius=radius;
        this.setColor(color);
        this.setFilled(filled);
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public double getDiameter(){
        return 2*radius;
    }
    public void printCircle() {
        System.out.println("The " + getColor() + " circle is created with the radius is " + radius);
    }
//Nhờ thừa kế, lớp Circle được thừa hưởng những phương thứ
// c getColor, setColor, getFilled, setFilled, và toString.
//
//Khởi tạo tử chồng Circle(double radius, String color,
// String filled) được triển khai bằng cách gọi phương thức
// setColor và setFilled để cài đặt các thuộc tính color và filled.

}


