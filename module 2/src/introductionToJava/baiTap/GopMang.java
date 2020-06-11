package introductionToJava.baiTap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    static void inputArr(int arr[], int n) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf(" Enter Element :" + i +"\n");
            arr[i] = input.nextInt();
        }
    }

    static void outputArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(" " + arr[i]);
        }
    }

    static void add_arr(int arr1[], int arr2[], int n,int m) {
        int arr3[] = new int[m+n];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
//        System.arraycopy(arr2,0,arr3,arr1.length,n); begin index start outsource index start nuber element add from begin
        int j=arr1.length;
        for (int i = 0; i <arr2.length ; i++) {
            arr3[j]=arr2[i];
            j++;
        }
        System.out.printf("New Array here: \n");
        outputArray(arr3);
    }

    public static void main(String[] args) {
        int n,m;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter Element Array1 \n");
        n = scanner.nextInt();
        System.out.printf("Enter Element Array2 \n");
        m = scanner.nextInt();
        int arr1[] = new int[n];
        System.out.printf("Input arr1 \n");
        inputArr(arr1, n);
        System.out.printf("Input arr2 \n");
        int arr2[] = new int[m];
        inputArr(arr2, m);
        add_arr(arr1, arr2,n,m);
    }
}
