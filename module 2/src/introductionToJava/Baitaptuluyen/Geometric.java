package introductionToJava.Baitaptuluyen;

import java.util.StringJoiner;

public class Geometric {
    private String color;
    private String filled="white";
   public Geometric(){

    }
    public Geometric(String color,String filled){
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
       return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getFilled(){
       return this.filled;
    }
    public void setFilled(String filled){
       this.filled=filled;
    }
    public String toString(){
       return "created with \"" + color + "\" color and " +
               (filled == null ? "no fill" : "filled with \"" + filled + "\" color");
    }
}
