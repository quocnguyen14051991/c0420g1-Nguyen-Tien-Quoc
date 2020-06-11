package introductionToJava.baiTap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    static void inputArray(int arr[], int n) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter number index:" + i + " ");
            arr[i] = input.nextInt();
        }
    }

    static void outArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(" " + arr[i] + ",");
        }
    }

    static void removeElement(int arr[], int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    static void findElement_remove(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                removeElement(arr, i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("nhap vao gia tri n");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        inputArray(arr, n);
        findElement_remove(arr, 0);
        outArray(arr);
    }
}
