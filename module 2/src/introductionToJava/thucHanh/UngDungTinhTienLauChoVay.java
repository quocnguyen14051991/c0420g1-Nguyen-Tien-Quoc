package introductionToJava.thucHanh;

import java.util.Scanner;

public class UngDungTinhTienLauChoVay {
    public static void main(String[] args) {
        double money=1.0;
        int month=1;
        double interset_rate=1.0;
        double total_interset=0;
        Scanner input=new Scanner(System.in);
        System.out.printf("Nhap so tien gửi:");
        money=input.nextDouble();
        System.out.printf("Nhập Số Tháng Gửi:");
        month=input.nextInt();
        System.out.printf("Nhập Lãi Xuất:");
        interset_rate=input.nextDouble();
        for(int i=0;i<month;i++){
            total_interset = money * (interset_rate/100)/12 * 3;
        }
        System.out.printf("Lãi Xuất trong năm"+total_interset);
    }
}
