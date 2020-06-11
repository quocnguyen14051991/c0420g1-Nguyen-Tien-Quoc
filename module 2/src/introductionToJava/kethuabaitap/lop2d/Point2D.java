package introductionToJava.kethuabaitap.lop2d;

public class Point2D {
    private float x;
    private float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {

        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = {this.x, this.y};
        return arr;
    }

    @Override
    public String toString() {
        return "(x,y)=" + "("+this.getX() + " ," + this.getY()+")";
    }
}