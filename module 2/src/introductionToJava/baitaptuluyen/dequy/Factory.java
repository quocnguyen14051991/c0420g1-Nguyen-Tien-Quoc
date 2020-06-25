package introductionToJava.baitaptuluyen.dequy;

import java.util.Scanner;

public class Factory {
    public static int deQuy(int n){
        if(n==0){
            return 1; // dieu kien dung cua function neu n==0 thi ket qua cua viec goi ham la 0
            // khi return la thoat khoi method toi khi gap truong hop dung se thoat khoi function
        }
        return deQuy(n-1)*n;// goi la function
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Input n");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        System.out.println("De Quy :"+deQuy(n));
    }
}
