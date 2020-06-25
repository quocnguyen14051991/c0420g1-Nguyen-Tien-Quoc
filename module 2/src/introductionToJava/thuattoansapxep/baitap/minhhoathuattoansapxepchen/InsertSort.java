package introductionToJava.thuattoansapxep.baitap.minhhoathuattoansapxepchen;

public class InsertSort {
    public static int[] arr = {6, 5, 8, 1, 3};

    public static void insertSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        insertSort(arr);
        for (int x : arr
        ) {
            System.out.println(x);

        }
    }
}
