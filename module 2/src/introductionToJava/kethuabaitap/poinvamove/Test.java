package introductionToJava.kethuabaitap.poinvamove;

public class Test {
    public static void main(String[] args) {
     Point point =new MovablePoint(3,7,5,9);
     MovablePoint x=(MovablePoint) point;
        x.setSpeed(3,9);
        System.out.println(x.getxSpeed());
        System.out.println(x.getySpeed());
        System.out.println(x.getX());
        System.out.println(x.getY());
        System.out.println(x.move().getX());
    }
}
