package introductionToJava.thucHanh;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        int a,b;
        Scanner input   = new Scanner(System.in);
        System.out.printf("Enter a:");
        a=input.nextInt();
        System.out.printf("Enter b:");
        b=input.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        while (a*b!=0){
            if(a>b){
                a=a-b;
            }else {
                b=b-a;
            }
        }
        System.out.printf("Uoc chung "+a);

    }
}
