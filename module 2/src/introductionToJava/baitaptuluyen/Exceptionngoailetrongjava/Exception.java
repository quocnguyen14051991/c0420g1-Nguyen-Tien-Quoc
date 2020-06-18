package introductionToJava.baitaptuluyen.Exceptionngoailetrongjava;

public class Exception {
    // định nghĩa:là 1 lỗi xảy ra trong quá trình chạy chương trình java khiến cho ch trình bị dừng lại
    //cần tránh exception trong thực tế
    // có 3 loại exception
    /*
    checked exception :có thể biết trước ở compile time
    unchecked exception :ko đoán trước đc do code kém
    Errors:là lỗi máy ảo hoặc thiếu bọ nhớ ko thể fix trong code
     */
    public static void main(String[] args) {
        int[] in=new int[3];
        System.out.println(in[3]);
        System.out.println("bị dừng ko thể thấy đc" +
                "");
    }
}
