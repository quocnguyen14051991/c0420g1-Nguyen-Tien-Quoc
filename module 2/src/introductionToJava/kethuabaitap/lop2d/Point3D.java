package introductionToJava.kethuabaitap.lop2d;

public class Point3D extends Point2D {
    private float z=0;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }
    public Point3D(){

    }
    public float getZ(){
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        setX(x);
        setY(y);
        this.z=z;
    }
    public float[] getXYZ(){
        float[] arr={getX(),getY(),this.z};
        return arr;
    }

    @Override
    public String toString() {
        return "XYZ"+getX()+" "+getY()+" " +this.z;
    }
}
