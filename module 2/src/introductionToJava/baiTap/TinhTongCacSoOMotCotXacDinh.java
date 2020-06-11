package introductionToJava.baiTap;

import java.util.Scanner;

public class TinhTongCacSoOMotCotXacDinh {
    public static void inputArr(float A[][], int m, int n) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Input emlemarr A [" + i + "]" + "[" + j + "]=");
                A[i][j] = input.nextFloat();
            }
        }
    }

    public static void ouputArr(float A[][], int m, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf(" " + A[i][j] + ",");
            }
        }
    }

    public static float findMax(float A[][], int n, int m) {
        float max = A[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] > max) {
                    max = A[i][j];
                }
            }
        }
        return max;
    }
    public static float sumElement(float A[][],int m,int n,int j){
        float sum=0;
        if(j<m&&j>=0){
            for (int i = 0; i <n ; i++) {
                sum+=A[i][j];
            }
        }
        else {
            System.out.printf("Sô cột bạn nhập ko có trong table");
        }
           return  sum;
    }

    public static void main(String[] args) {
        int n, m,j;
        Scanner input = new Scanner(System.in);
        System.out.printf("input row");
        n = input.nextInt();
        System.out.printf("input colums");
        m = input.nextInt();
        //khai báo ma trận có n dòng m cột
        float A[][] = new float[n][m];
        inputArr(A, m, n);
        float max = findMax(A, n, m);
        System.out.printf("max in array" + max + "\n");
        ouputArr(A, n, m);
        System.out.printf("input colum total: \n");
        j=input.nextInt();
        float sum=sumElement(A,n,m,j);
        System.out.printf("Sum colum of"+" "+j+"is"+" "+sum);
    }
}
