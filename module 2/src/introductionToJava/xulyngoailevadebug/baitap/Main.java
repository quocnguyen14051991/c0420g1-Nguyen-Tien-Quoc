package introductionToJava.xulyngoailevadebug.baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        input();
    }

    public static void input() {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        try {
            System.out.println("input a:");
            a = Double.parseDouble(input.nextLine());
            System.out.println("input b:");
            b = Double.parseDouble(input.nextLine());
            System.out.println("input c:");
            c = Double.parseDouble(input.nextLine());
            if (a < 0 || b < 0 || c < 0) {
                throw new IllegalTriangleException("không hợp lệ");
            }
            if (a + b < c || b < a + c || c < a + b) {
                throw new IllegalTriangleException("không đủ điều kiện của tam giác");
            }
        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {// catch cuối cùng là catch chung nhất
            e.printStackTrace();
        }
    }
}
