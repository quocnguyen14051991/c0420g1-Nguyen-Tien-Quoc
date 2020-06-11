package introductionToJava.baiTap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    static void inputArr(int arr[], int n) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element" + i);
            arr[i] = input.nextInt();
        }
    }

    static void outputArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(" " + arr[i]);
        }
    }

    static void addArr(int arr[], int n, int x, int index) {
        int i;
        int newArr[] = new int[n + 1];
        for (i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }
//        for (int j = newArr.length-2; j >=index ; j--) {
//            newArr[j+1]=newArr[j];
//        }
        for (int j = newArr.length - 1; j > index; j--) {
            newArr[j] = newArr[j - 1];
        }
        newArr[index] = x;
        outputArr(newArr);
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhap vao so phan tu cua mang: \n");
        n = input.nextInt();
        int arr[] = new int[n];
        inputArr(arr, n);
        System.out.printf("Mảng Sau khi thêm là : \n");
        addArr(arr, n, 9, 0);
    }
}
