package introductionToJava.kethuabaitap.triangle;

public class Triangle extends Shape {
double side1=1;
double side2=1;
double side3=1;

    public Triangle() {
    }

    public Triangle(String color, boolean value) {
        super(color, value);
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean value, double side1, double side2, double side3) {
        super(color, value);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
    public double getArea(){
        double p=getPerimeter()/2;
        return  Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public String toString() {
        return "Tam giac co 3 canh a="+this.side1+" "+"b= "+this.side2+" "+"c= "+this.side3+" "+"color:"+this.color+" "+"fill"+this.filled+" "+"co dien tich="+this.getArea()+" "+"co chu vi="+this.getPerimeter();
    }
}
