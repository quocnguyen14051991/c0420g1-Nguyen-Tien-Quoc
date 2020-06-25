package introductionToJava.xulyngoailevadebug.thuchanh.thuchanhsudunglopNumberFormatException;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập x:");
        int x = scanner.nextInt();
        System.out.println("nhập y");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;

            System.out.println("Tổng x+y=" + a);
            System.out.println("Hiệu của x-y=" + b);
            System.out.println("Tích X*Y=" + c);
            System.out.println("Thương X/Y=" + d);
        } catch (Exception e) {
            System.err.println("xãy ra ngoại lệ" + e.getMessage());
        }
    }
}
