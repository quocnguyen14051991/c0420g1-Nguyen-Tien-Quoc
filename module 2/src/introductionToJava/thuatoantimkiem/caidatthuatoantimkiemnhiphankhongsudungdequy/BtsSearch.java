package introductionToJava.thuatoantimkiem.caidatthuatoantimkiemnhiphankhongsudungdequy;

public class BtsSearch {
    public static int binarySeach(int[] list,int key){
        int low=0;
        int height=list.length-1;
        while (height>=low){
            int mid=(low+height)/2;
            if(key<list[mid]){
                height=mid-1;
            }else if(key==list[mid]){
                return mid;
            }else {
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,9,22,55,100,300,900,1000,1002,2002};
        int position=binarySeach(arr,2002);
        System.out.println(position);
    }
}
