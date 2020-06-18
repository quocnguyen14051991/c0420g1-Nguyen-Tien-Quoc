package introductionToJava.LopVaDoiTuong.thuchanhvabaitap.ThucHanh;

public class Dog extends Animal {
    public void eat(){
        System.out.printf("Dog dang an");
    }
//gắn kết động (Dynamic Bingding) khi kiểu của đối tượng được quyết định bởi runtime
    //gắn kết tỉnh (Static Bingding)khi kiểu của đối tượng đc quyết định bởi compiler thì ddos là static bingding
    //Nếu có bất cứ phương thức private, final hoặc static nào trong một lớp, thì đó là gắn kết tĩnh.
// Do đó, không thể có chuyện ghi đè (overloading) kết quả đối với lập trình hướng đối tượng trong Static binding
    public static void main(String[] args) {
        Animal d=new Dog();
        d.eat();
    }
}
