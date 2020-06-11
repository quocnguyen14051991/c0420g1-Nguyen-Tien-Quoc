package introductionToJava.thucHanh;
import java.util.Scanner;
public class DaoNguocCacPhanTuCuaMang {
    static  void inputArray(int[] arr,int n) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập vào phần tử thứ " + i);
            arr[i] = scanner.nextInt();
        }
    }
    static void outArray(int arr[]) {
        System.out.printf("Phan tu trong mang la:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(" " + arr[i]);
        }
    }
    static void resever(int arr[]) {
        int firts = 0, last = arr.length - 1;
        while (firts < last) {
            int temp = arr[firts];
            arr[firts] = arr[last];
            arr[last] = temp;
            firts++;
            last--;
        }
    }
    public static void main(String[] args) {
        int number;
        System.out.printf("Enter number array");
        Scanner input = new Scanner(System.in);
        number=input.nextInt();
        int arr[]=new int[number];
        inputArray(arr,number);
        resever(arr);
        System.out.printf("mang sau khi đc đảo ngược:");
        outArray(arr);
    }
}
