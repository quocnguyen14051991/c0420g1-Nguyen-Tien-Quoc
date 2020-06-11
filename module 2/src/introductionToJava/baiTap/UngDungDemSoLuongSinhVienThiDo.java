package introductionToJava.baiTap;

import java.util.Scanner;

public class UngDungDemSoLuongSinhVienThiDo {
    public static void inpuArray(int arr[], int n) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("input index"+" " + i);
            arr[i] = input.nextInt();
        }
    }

    public static void outputArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf(" " + arr[i]);
        }
    }

    public static int checkSinhVien(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5 && arr[i] <= 10) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        boolean check = false;
        do {
            System.out.printf("input Score Student:");
            n = input.nextInt();
            if (n > 30) {
                System.out.printf("Vui long nhap lai so luong <30");
                continue;
            }
            check = true;
        } while (!check);
        int arr[] = new int[n];
        inpuArray(arr,n);
        int soLuongSv = checkSinhVien(arr);
        System.out.printf("Sl sinh vien qua môn" + soLuongSv);
    }
}
