package introductionToJava.kethuabaitap.triangle;

public class Shape {
    String color="green";
    boolean filled=true;
    Shape(){

    }
    Shape(String color, boolean value)
    {
        this.color=color;
        this.filled=value;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void isFilled(boolean value)
    {
        this.filled=value;
    }
    public String getColor(){
        return this.color;
    }
    public boolean getFill(){
        return this.filled;
    }

    @Override
    public String toString() {
        return "A shape with color of"+this.color+"filled"+this.filled;
    }
}
