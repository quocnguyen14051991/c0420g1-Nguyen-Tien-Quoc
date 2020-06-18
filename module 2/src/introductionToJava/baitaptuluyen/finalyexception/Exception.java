package introductionToJava.baitaptuluyen.finalyexception;

public class Exception {
    public static void main(String[] args) {
        int[] arr={1,2};
        try {
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("loi");
        }

        catch (java.lang.Exception e){
            System.out.println("loi");
        }finally {//finally co nghĩa là luôn thực hiện khối lệnh bên trong nó dù có exception có xảy ra hay ko
            System.out.println("finally");
        }
        System.out.println("ket thuc");

    }
}
