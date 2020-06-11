package introductionToJava.thucHanh;

import java.util.Scanner;

public class CheckYearLeap {
     static int year;
    public static void checkYearLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("la nam nhuan");
            } else {
                if (year % 400 == 0) {
                    System.out.println("la nam nhuan");
                } else {
                    System.out.println("ko la nam nhuan");
                }
            }
        }else {
            System.out.println("ko la nam nhuan");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao nam");
        year=scanner.nextInt();
        checkYearLeap(year);
    }
}



