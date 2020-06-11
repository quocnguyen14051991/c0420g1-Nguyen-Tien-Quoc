package introductionToJava.kethuabaitap.lop2d;

public class TestPoin2d  {
    public static void main(String[] args) {
        Point2D point2D=new Point3D(3,6,8);
        System.out.println("khi goi pt get xy cua poin2d");
        float[] arr=point2D.getXY();
        for (int i = 0; i <arr.length ; i++) {
            System.out.printf(""+String.valueOf(arr[i]));
        }
        System.out.println();
        System.out.println("X,y"+" "+point2D.getX()+" "+point2D.getY());
        Point2D point2D1=(Point3D) point2D;
        System.out.println(point2D1.toString());
    }
}
