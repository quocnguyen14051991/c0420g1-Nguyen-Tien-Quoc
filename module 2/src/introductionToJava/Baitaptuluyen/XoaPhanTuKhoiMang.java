package introductionToJava.Baitaptuluyen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
//    public static void inputArr(int arr[],int n) {
//        Scanner input=new Scanner(System.in);
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.printf("Input index array"+i);
//            arr[i]=input.nextInt();
//        }
//    }
//
//    public static void outputArr(int arr[]) {
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.printf(" "+arr[i]);
//        }
//    }
//
//    public static void removeImplement(int arr[],int index) {
//        for (int i = index; i <arr.length-1 ; i++) {
//            arr[i]=arr[i+1];
//        }
//        arr[arr.length-1]=0;
//    }
//    public static void addImplement(int arr[],int index,int x,int n){
//        int newarr[] =new int[n+1];
//       System.arraycopy(arr,0,newarr,0,n);
       //// arr mảng nguồn,0 vị trí bắt đầu copy;newarr mảng đích;vị trí bắt đầu trong mảng đích,n số lượng phần tử copy từ mảng nguồn
//        c2:
//        for (int i = 0; i <n ; i++) {
//            newarr[i]=arr[i];
//        }
//        arr= Arrays.copyOf(arr,arr.length+1);
        //trả về mảng mới vs kích thước lớn hơn

//        for (int i = newarr.length-1; i>index ; i--) {
//            newarr[i]=newarr[i-1];
//        }
//        newarr[index]=x;
//        outputArr(newarr);
//        outputArr(arr);
//    }
//    public static void add_element(int arr[]){
//        ArrayList<Integer> array=new ArrayList<Integer>();
//       array.add(2);
//       array.remove(0);
//        System.out.printf(String.valueOf(array));
//    }

    public static void main(String[] args) {
//      int n,index=2;
//      Scanner input=new Scanner(System.in);
//        System.out.printf("Enter number emplement Array \n");
//        n=input.nextInt();
//        int arr[]=new int[n];
//        inputArr(arr,n);
////        removeImplement(arr,index);
//        addImplement(arr,index,100,n);
////        outputArr(arr);
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(3,0);
        arrayList.remove(4);
        System.out.printf(" "+arrayList);

    }
}
