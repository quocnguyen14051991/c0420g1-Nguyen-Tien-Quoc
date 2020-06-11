package introductionToJava.thucHanh;

import java.util.Scanner;

public class ThucHanhArr1 {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.printf("Nhập số lượng phần tử của mảng");
            size=input.nextInt();
            if(size>20){
                System.out.printf("Size does not exceed 20");

            }
        }while (size>20);
        array= new int[size];
        int[] arrx= new int[20];
        for (int i = 0; i <arrx.length ; i++) {
            arrx[i]=input.nextInt();
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }





    }
}
