package introductionToJava.LopVaDoiTuong.ThucHanhVaBaiTap.Baitap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        double r1;
        r1 = (-b + Math.sqrt(getDiscriminant(a, b, c))) / 2 * a;
        return r1;
    }

    public double getRoot2() {
        double r2;
        r2 = (-b - Math.sqrt(getDiscriminant(a, b, c))) / 2 * a;
        return r2;
    }

    @Override
    public String toString() {
        return "Phương trình có a= " + a + "b= " + b + "c= " + c;
    }

    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        a = input.nextDouble();
        System.out.println("Enter b:");
        b = input.nextDouble();
        System.out.println("Enter c");
        c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        delta = quadraticEquation.getDiscriminant(a, b, c);
        System.out.println(quadraticEquation.toString());
        if (delta > 0) {
            System.out.println("x1=" + quadraticEquation.getRoot1());
            System.out.println("x2=" + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("x1=x2=" + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
