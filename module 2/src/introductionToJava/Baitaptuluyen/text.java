package introductionToJava.Baitaptuluyen;

public class text {
    public static void main(String[] args) {
        Flyable flyable =new Flyable() {// đây là lớp nặc danh là lớp đc khai báo và khởi tạo đối tượng tại cùng 1 thời điểm
            //Anymouse class cần kế thừa 1 lớp  hoặc triển khai 1 interface
            @Override
            public String fly() {
                return "hello";
            }
        };
        System.out.println(flyable.fly());
    }


}
