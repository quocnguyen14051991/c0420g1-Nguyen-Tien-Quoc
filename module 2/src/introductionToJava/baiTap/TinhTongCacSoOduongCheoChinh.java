package introductionToJava.baiTap;

import java.util.Scanner;

public class TinhTongCacSoOduongCheoChinh {
    public static void inputArray(float arr[][], int n) {
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Arr(["+i+"]"+"["+j+"])");
                arr[i][j]=input.nextFloat();
            }
        }
    }
    public static void outputArray(float arr[][],int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.printf(" "+arr[i][j]);
            }
            System.out.printf("\n");
        }
    }
    public static float sumArr(float arr[][],int n) {
        int sum=0;
        for (int i = 0; i <n ; i++) {
           sum+=arr[i][i];
        }
        for (int i = 0; i <n ; i++) {
            for (int j = n-1; j >=0 ; j--) {
                sum+=arr[i][j];
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int size;
        Scanner input=new Scanner(System.in);
        System.out.printf("Input number Arr \n");
        size=input.nextInt();
        float arr[][]=new float[size][size];
        inputArray(arr,size);
        outputArray(arr,size);
        float sum=sumArr(arr,size);
        System.out.printf("Sum đường chéo"+sum);


    }
}
