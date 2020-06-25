package introductionToJava.thuatoantimkiem.baitap.caidatthuatoantimkiemnhiphan;

public class BtsSearch {
    public static int binarySearch(int arr[], int low, int high, int value)
    {
        if (high>=low)
    {
        int mid = low + (high - low)/2;
        if (arr[mid] == value)
        return mid;
    if (arr[mid] > value)
        return binarySearch(arr, low, mid-1, value);
    return binarySearch(arr, mid+1, high, value); }
        return -1; }

    public static void main(String[] args) {
        int[] arr={1,3,6,7,8};
        int ValueIn=binarySearch(arr,0,4,8);
        System.out.println(ValueIn);
    }
}
