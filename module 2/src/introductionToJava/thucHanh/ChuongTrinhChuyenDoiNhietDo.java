package introductionToJava.thucHanh;

import java.util.Scanner;

public class ChuongTrinhChuyenDoiNhietDo {
    static double cToF(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    static double fToC(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    static void show_menu(){
        System.out.println("\t \t \t Menu. \n");
        System.out.println("1. Fahrenheit to Celsius \n");
        System.out.println("2. Celsius to Fahrenheit \n");
        System.out.println("0. Exit \n");
        System.out.println("Enter your choice: \n");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        show_menu();
        choice=input.nextInt();
        switch (choice){
            case 1:{
                System.out.printf("Enter celsius:");
                fahrenheit=input.nextDouble();
                System.out.printf("F To C:"+fToC(fahrenheit)+"\n");
                show_menu();
                break;
            }
            case 2:{
                System.out.printf("Enter fahrenheit:");
                celsius=input.nextDouble();
                System.out.printf("C To F"+ cToF(celsius)+"\n");
                show_menu();
                break;
            }
            case 0:{
                System.exit(0);
            }
        }
    }
}
