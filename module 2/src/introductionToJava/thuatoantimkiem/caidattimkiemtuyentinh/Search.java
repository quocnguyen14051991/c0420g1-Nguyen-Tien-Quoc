package introductionToJava.thuatoantimkiem.caidattimkiemtuyentinh;

public class Search {
    public int linearSearch(int arr[], int value)
    {
        for (int i = 0; i < arr.length; i++)
    {
        if (arr[i] == value) return i;
    }
    return -1; }
}
