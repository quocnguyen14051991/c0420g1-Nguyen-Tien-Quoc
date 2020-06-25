package introductionToJava.baiTap;

public class NoiBoy {
    public static int[] arr={1,3,2,4,5,6,7};
    public static void sx(int[] arr){
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = arr.length-1; j >i ; j--) {

                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
    }

    public static void main(String[] args) {
        sx(arr);
        for (int x: arr
             ) {
            System.out.println(x);

        }
    }
}
