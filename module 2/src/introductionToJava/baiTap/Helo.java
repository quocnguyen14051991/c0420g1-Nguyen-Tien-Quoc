package introductionToJava.baiTap;

import java.util.Scanner;

public class Helo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Enter Name:");
        name=scanner.next();
        System.out.println("Hello"+" "+name);
    }
}
