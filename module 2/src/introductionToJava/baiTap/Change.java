package introductionToJava.baiTap;

import java.util.Scanner;

public class Change {
    public static final int TIGIA=23000;
    public static void main(String[] args) {
        float usd;
        System.out.println("Nhap vao so tien usd can chuyen");
        usd= new Scanner(System.in).nextFloat();
        System.out.println("So Tien La:"+(usd*TIGIA)+"Vnd");
    }
}
