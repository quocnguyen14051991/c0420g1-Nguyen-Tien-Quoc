package introductionToJava.baiTap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
   static Scanner input=new Scanner(System.in);
    static void inputArray(int arr[],int size){

        for (int i = 0; i <size ; i++) {
            System.out.printf("input for index:"+i);
            arr[i]=input.nextInt();
        }
    }
    static void outputArray(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.printf(" "+arr[i]);
        }
    }
    static int findMin(int arr[]){
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int n,min, arr[];
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Enter Element");
        n=scanner.nextInt();
        arr=new int[n];
        inputArray(arr,n);
        min=findMin(arr);
        System.out.printf("min element="+min);
    }
}
