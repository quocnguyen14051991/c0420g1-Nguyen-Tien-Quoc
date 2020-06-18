package introductionToJava.baitaptuluyen.trycatchbatloiexception;

public class NgoaiLe {

    public static void main(String[] args) {
        int arr[]={3,2};
        try{
            System.out.println(arr[2]);
        }catch (Exception e){
            System.out.println(e);

        }
        System.out.println("ket thuc");

    }
}
