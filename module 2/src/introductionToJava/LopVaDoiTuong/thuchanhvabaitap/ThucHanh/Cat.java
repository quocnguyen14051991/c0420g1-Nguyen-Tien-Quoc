package introductionToJava.LopVaDoiTuong.thuchanhvabaitap.ThucHanh;

public class Cat extends Anunu {
   public String nois(){
       return "ccccc";
   }

    @Override
    public void eat() {
        System.out.println("kệ bố thôi mà");
    }

    public static void main(String[] args) {
        Anunu cat=new Cat();
        System.out.println(((Cat) cat).nois());
        cat.eat();
        cat.eat();
        System.out.println(cat.Said());
    }
}
