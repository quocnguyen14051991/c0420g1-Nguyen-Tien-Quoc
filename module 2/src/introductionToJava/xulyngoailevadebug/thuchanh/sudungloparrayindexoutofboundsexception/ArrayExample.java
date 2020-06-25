package introductionToJava.xulyngoailevadebug.thuchanh.sudungloparrayindexoutofboundsexception;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random random =new Random();
        Integer[] arr=new Integer[100];
        System.out.println("Danh sách phẩn tử của mảng:");
        for (int i = 0; i <100 ; i++) {
            arr[i]=random.nextInt(100);
            System.out.println(arr[i]+" ");
        }
        return  arr;
    }

    public static void main(String[] args) {
        int x = 0;
        ArrayExample arrayExample=new ArrayExample();
        Integer[] arr=arrayExample.createRandom();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vui lòng nhập chỉ số của 1 phần tử bất kỳ");

        try {
            x=scanner.nextInt();
        }
        catch (InputMismatchException miss){
            System.out.println("InputMismatchException");
            System.out.println(miss.getMessage());
        }
        try {
            System.out.println("Giá trị của phần tử có chỉ số :" + x + "is" + arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Erro");
        }
        System.out.println("Test");

    }
}
