package introductionToJava.thucHanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public  boolean checkis(int n){
        if(n==1){
            return false;
        }
        else {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count > 2) {
                return false;
            } else {
                return true;
            }
        }
        }
    public static void main(String[] args) {
        int n;
        boolean check;
        Scanner scanner= new Scanner(System.in);
        System.out.printf("nhap so de kiem tra");
        n=scanner.nextInt();
        KiemTraSoNguyenTo kiemTra=new KiemTraSoNguyenTo();
        check=kiemTra.checkis(n);
        System.out.printf("This is"+" " +check);


    }
}
