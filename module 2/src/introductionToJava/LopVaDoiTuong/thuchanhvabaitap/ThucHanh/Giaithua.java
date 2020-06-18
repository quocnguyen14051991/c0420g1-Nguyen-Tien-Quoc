package introductionToJava.LopVaDoiTuong.thuchanhvabaitap.ThucHanh;

import java.util.Scanner;

public class Giaithua {
    private static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.printf("input n=");
        n=input.nextInt();
        int result=giaithua(n);
        System.out.printf("result="+result);


    }
    public static int giaithua(int n){
        if(n>0){
            return n*giaithua(n-1);
        }
        else if(n==1) {
            return 1;
        }else {
            return 0;
        }
    }
}
