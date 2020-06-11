package introductionToJava.kethuabaitap.poinvamove;

public class MovablePoint extends Point  {
    private float xSpeed=0;
    private float ySpeed=0;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] arr={this.xSpeed,this.ySpeed};
        return arr;
    }

    @Override
    public String toString() {
        return "x,y"+getX()+" "+getY()+"speed(x,y)"+this.getSpeed();
    }
   public MovablePoint move(){
        float x=super.getX();
        float y=super.getY();
        x=x+this.getxSpeed();
        y=y+this.getySpeed();
        return this;
   }
}
