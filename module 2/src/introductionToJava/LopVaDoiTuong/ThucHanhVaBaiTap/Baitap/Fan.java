package introductionToJava.LopVaDoiTuong.ThucHanhVaBaiTap.Baitap;

public class Fan {
    public static final int SLOW=1;
    public static final int MEDIUM=2;
    public static final int FAST=3;
    private int speed=SLOW;
    private boolean on=false;
    private double radius=5;
    private String color="blue";

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Fan(){

    };

    @Override
    public String toString() {
        if(!isOn()){
            return "Fan is have Speed: "+" " +this.speed+" "+"Color:"+this.color+" "+"radius:"+this.radius+"Fan is on";
        }else {
            return "fan have color: "+" "+this.color+" "+"radius:"+this.radius+" "+"Fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1=new Fan();
        Fan fan2=new Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(false);
        fan2.setSpeed(MEDIUM);
        fan2.radius=5;
        fan2.setOn(true);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
