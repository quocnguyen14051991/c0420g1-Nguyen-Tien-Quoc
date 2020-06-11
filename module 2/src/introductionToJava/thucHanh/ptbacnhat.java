package introductionToJava.thucHanh;

import java.util.Scanner;

public class ptbacnhat {
    public static void main(String[] args) {
        float a,b,c,x;
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        a=scanner.nextFloat();
        System.out.println("Enter b:");
        b=scanner.nextFloat();
        System.out.println("Enter c:");
        c=scanner.nextFloat();
        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh vo nghiem");
            }else {
                System.out.println("Phuong Trinh vo so nghiem");
            }
        }else {
            System.out.println("phuong trinh co nghiem x"+(c-b/a));
        }

    }
}
