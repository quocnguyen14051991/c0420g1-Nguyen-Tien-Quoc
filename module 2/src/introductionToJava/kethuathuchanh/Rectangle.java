package introductionToJava.kethuathuchanh;

public class Rectangle extends Shape {
    double width=1.0,lenght=1.0;

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color, boolean value, double width, double lenght) {
        super(color, value);
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(){

    }

    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getArea(double width,double lenght){
        return this.width*this.lenght;
    }
    public double getPerimeter(double width,double lenght){
        return 2*(this.lenght+this.width);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="+this.width+"length="+this.lenght+"which is a subclass of"+super.toString();
    }
}
