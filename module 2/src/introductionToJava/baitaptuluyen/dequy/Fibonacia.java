package introductionToJava.baitaptuluyen.dequy;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibonacia {
    public static int Fibonacia(int n){
        // cong thuc F(n)=F(n-1)+F(n-2)
        if(n==0||n==1){
            return n;
        }
        return Fibonacia(n-1)+Fibonacia(n-2);
    }

    public static void main(String[] args) {
        int n;
        int sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("input n");
        n=input.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.print(Fibonacia(i)+" ");
            arr[i]=Fibonacia(i);
        }
        System.out.println();
       sum(arr);

    }

    public static void sum(int... arr) {
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
