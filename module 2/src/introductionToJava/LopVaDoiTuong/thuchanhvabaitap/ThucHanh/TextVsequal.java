package introductionToJava.LopVaDoiTuong.thuchanhvabaitap.ThucHanh;

public class TextVsequal extends Animalxxxxxx{
    static void method(Animalxxxxxx a){
        System.out.println(a instanceof TextVsequal);
        if(a instanceof TextVsequal){
            TextVsequal d=(TextVsequal) a;
            System.out.println("ok");
        }else {
            System.out.println("not ok");
        }
    }


    public static void main(String[] args) {
        Animalxxxxxx a=new TextVsequal();
        method(a);
//        String str1=new String("quoc");
//        String str2=new String("quoc");
//        System.out.println(str1==str2);
//        System.out.println(str1.equals(str2));
        // thứ nhất str2 và str1 đc khởi tạo vs từ khóa new nên jvm sẻ cung cấp 2 vùng nhớ khác nhau để
        //chứa 2 object str1 và str2
        // thứ 2 trong java có biến kiểu tham chiếu và kiểu tham trị
        // kiểu tham trị thì chỉ dùng chỉ toán tử ==;
        // khii dùng kiểu tham chiếu thì cho phép sử dụng cả 2 ==  và equals()
        // khi dùng toán tử == có nghĩa là bộ xử lý của java sẻ kiểm tra xem 2 biến tham chiếu này có
        //trỏ đến 1 đối tượng hay ko?
        // câu trả lời ở đây là ko vì chugns ko cùng vùng nhớ nhưng có cùng giá trị
        // khi sử dụng equals thì bộ xử lý của java sẻ so sánh giá trị của 2 biến tham chiếu này mặc dù ko cùng 1 vùng nhớ
//        TextVsequal textVsequal=new TextVsequal();

//        TextVsequal textVsequal=null; ///
//        khi kiểu lớp con muốn tham chiếu đến vùng nhớ của đối tượng lớp cha nếu tham chieus bình thường như dưới thì sẻ bị
//                trình biên dịch compiler báo lỗi
//        nếu ép kiểu thì lúc runtime sẻ báo lỗi
////        System.out.println(textVsequal instanceof Animalxxxxxx);// trình biên dịch báo lỗi
//        TextVsequal textVsequal =(TextVsequal)new Animalxxxxxx(); loiox ngoại lệ khi runtime
//        cách để kiểu của lớp con tham chiếu đến đối tượng lớp cha t sử đụng toán tử instance of



        }
}
 class Animalxxxxxx{

}
