package introductionToJava.baiTap;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKiTu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str="Helloc";
        char c;
        System.out.printf("input one char: \n");
        c=scanner.nextLine().charAt(0);
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==c){
                count++;
            }
        }
        System.out.printf("số lần xuất hiện ký c là :"+count);
    }
}
