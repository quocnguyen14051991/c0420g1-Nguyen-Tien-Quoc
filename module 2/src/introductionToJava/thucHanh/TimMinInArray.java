package introductionToJava.thucHanh;

import java.util.Scanner;

public class TimMinInArray {
    static void inputArray(int[] arr,int n){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <n ; i++) {
            System.out.printf("Index:"+i+" ");
            arr[i]=input.nextInt();
        }
    }
    static void outArray(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.printf(" "+arr[i]+"\n");
        }
    }
    static int found_Min(int[] arr){
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min){
               min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        boolean check=false;
        do{
            System.out.printf("Enter Size Array");
            n=input.nextInt();
            if(n>20){
                System.out.printf("Maximum arr is 20");
                continue;
            }
            check=true;
        }while (!check);
        int arr[]=new int[n];
        inputArray(arr,n);
        outArray(arr);
        System.out.printf("min is "+ found_Min(arr));

    }
}
