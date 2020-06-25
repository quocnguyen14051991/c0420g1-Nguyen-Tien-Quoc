package introductionToJava.baitaptuluyen.dequy;

import java.util.Scanner;

public class Sum {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return sum(n-1)+n;
    }

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("sum is:"+sum(4));

    }
}
