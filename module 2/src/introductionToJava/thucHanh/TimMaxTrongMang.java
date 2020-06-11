package introductionToJava.thucHanh;

import java.util.Scanner;

public class TimMaxTrongMang {
    static void input_arr(int[] arr,int n){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <n ; i++) {
            System.out.printf("nhap phan tu thu"+i);
            arr[i]=input.nextInt();
        }
    }
    static void out_input(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.printf(" "+arr[i]);
        }
    }
   static int found_max(int[] arr){
        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int size;
        boolean check=false;
        Scanner input= new Scanner(System.in);
        do{
            System.out.printf("input size array: \n");
            size=input.nextInt();
            if(size>20){
                System.out.printf("Size should not exceed 20");
                continue;
            }
            check=true;
        }while (!check);
        int arr[]=new int[size];
        input_arr(arr,size);
        System.out.printf("Max element:"+found_max(arr)+"\n");
        out_input(arr);

    }
}
