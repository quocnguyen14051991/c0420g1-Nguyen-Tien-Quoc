package introductionToJava.kethuathuchanh;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public Square() {
    }

    public Square(String color, boolean value, double side) {
        super(color, value, side, side);
    }

    public double getSide(){
        return this.width;
    }
    public void setSide(double side){
        this.width=side;
        this.lenght=side;
    }

    @Override
    public void setLenght(double lenght) {
        setSide(lenght);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public String toString() {
        return "A Square with side="+this.getSide()+ "which is a subclass of" +super.toString();
    }
}
