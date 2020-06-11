package introductionToJava.kethuabaitap.triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a,b,c;
        String color="";
        System.out.println("nhap a=");
        a=Double.parseDouble(input.nextLine());
//        a=input.nextDouble();
        System.out.println("nhap b");
//        b=input.nextDouble();
        b=Double.parseDouble(input.nextLine());
        System.out.println("nhap c");
//        c=input.nextDouble();
        c=Double.parseDouble(input.nextLine());
        System.out.println("nhap vao color");
        color=input.next();

        Shape triangle =new Triangle(color,false,a,b,c);
        Triangle triangle1=(Triangle) triangle;
//        System.out.println(triangle1.getArea());
//        System.out.println(triangle1.getPerimeter());
        System.out.println(triangle1.toString());


    }
}
